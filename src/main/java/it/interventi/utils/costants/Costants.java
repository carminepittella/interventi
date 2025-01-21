package it.interventi.utils.costants;

public class Costants {

    /**
     * @Auth
     */
    public static class AuthMessage {
        public static final String LOGIN_SUCCESS_MEX = "Login avvenuto con successo!";
        public static final String LOGIN_FAILED_MEX = "Login fallito!\nUsername e/o password errati";
        public static final String REGISTER_SUCCESS_MEX = "Registrazione avvenuta con successo!";
        public static final String REGISTER_FAILED_MEX = "Registrazione fallita!\nQualcosa è andato storto, riprovare";
    }

    /**
     * @Pages
     */
    public static class LinkPages {
        public static final String REDIRECT = "redirect:";
        public static final String LOGIN_PAGE = "/auth/login";
        public static final String REGISTER_PAGE = "/auth/register";
        public static final String HOME_PAGE = "/home";
        public static final String LOGIN_FAILED_PAGE = "/auth/login?error=true";
    }
}
