package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        // 26 letters in English alphabet; wraparound if needed.
        shift = shift%26;

        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);
           
            //sb.append(currentChar); ERROR FOUND

            // handle spaces (they are not altered)
            // NOTE: clarify with customer before final submit:
            // are spaces to be shifted or not?
            //
            if (currentChar == ' '){
                sb.append((char) (currentChar));
            }
            else {
                // valid non-space characters are shifted
                if (currentChar > 'z' || currentChar < 'a') {
                    return "invalid";
                } else if ((char) (currentChar + shift) > 'z') {
                    currentChar = (char) (currentChar - 26);
                } else if ((char) (currentChar + shift) < 'a') {
                    currentChar = (char) (currentChar + 26);
                }
                sb.append((char) (currentChar + shift));
            }
        }

        return sb.toString();
    }
}
