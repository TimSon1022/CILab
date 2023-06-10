public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if (myString == null) {
            return false;
        }

        int capitalCount = 0;
        for (char c : myString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
        }

        if (capitalCount == myString.length() || capitalCount == 0 || (capitalCount == 1 && Character.isUpperCase(myString.charAt(0)))) {
            return true;
        }

        return false;
    }
}
