public class SessionManager {
    private UserSession currentUserSession;

    public void createSession(int userId, String username, String role) {
        currentUserSession = new UserSession(userId, username, role);
    }

    public void printUserInfo() {
        if (currentUserSession != null) {
            System.out.println("User ID: " + currentUserSession.userId());
            System.out.println("Username: " + currentUserSession.username());
            System.out.println("Role: " + currentUserSession.role());
        } else {
            System.out.println("No active session.");
        }
    }

    public void clearSession() {
        currentUserSession = null;
    }
}
