package patterns.facade;

public class SecurityCodeCheck {
    private final int securityCode;

    public SecurityCodeCheck() {
        securityCode = 1234;
    }

    public boolean isValidSecurityCode(int codeToCheck) {
        return codeToCheck == getSecurityCode();
    }

    public int getSecurityCode() {
        return securityCode;
    }
}
