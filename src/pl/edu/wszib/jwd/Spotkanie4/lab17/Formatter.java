package pl.edu.wszib.jwd.Spotkanie4.lab17;

public enum Formatter {
    CALM{
        public String format(String message){
            return "Here is your message: " + message;
        }
    },
    NERVOUS{
        @Override
        public String format(String message) {
            return "ARGH! STOP BOTHERING ME WITH YOUR MESSAGE! " + message;
        }
    };

    public abstract String format(String message);
}
