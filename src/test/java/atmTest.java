import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class atmTest {

        //Arrange
        Atm underTest = new Atm(50, "1234");
    @Test
    public void shouldHaveDefaultBalanceof50(){
        //Act
        int actualBalance = underTest.getBalance();
        //Assert
        assertEquals(50, actualBalance);
    }

    @Test
    public void shouldHaveADefaultBalanceof100(){
        //Arrange
        Atm underTest = new Atm(100, "1234");
        //Act
        int actualBalance = underTest.getBalance();
        //Assert
        assertEquals(100, actualBalance);
    }

    @Test
    public void depositOf50ShouldIncreaseAnInitialBalanceOf50To100(){
        Atm underTest = new Atm(50, "1234");
        underTest.deposit(50);
        int actualBalance = underTest.getBalance();
        assertEquals(100, actualBalance);
    }

    @Test
    public void withdrawOf50ShouldDecreaseAnInitialBalanceOf50To0(){
        underTest.withdraw(50);
        int actualBalance = underTest.getBalance();
        assertEquals(0,actualBalance);
    }

    @Test
    public void withdrawOf51ShouldReturnOriginalBalanceOf50(){
        underTest.withdraw(51);
        int actualBalance = underTest.getBalance();
        assertEquals(50,actualBalance);
    }

    @Test
    public void shouldAllowUserAccessWithCorrectPin(){
        boolean accessResult = underTest.accessAccount("1234");
        assertEquals(true,accessResult);
    }

    @Test
    public void shouldDenyUserAccessWithIncorrectPin(){
        boolean accessResult = underTest.accessAccount("1111");
        assertEquals(false,accessResult);
    }
}
