public class Palindrome 
{
    private String text;
    private String textAux;

    public Palindrome()
    {
        this.text = "";
    }

    public String getText() 
    {
        return text;
    }

    public void setText(String text) 
    {
        this.text = text;
        this.textAux = text.toLowerCase();
    }

    public String deleteSpaces()
    {
        int i = 0;
        while (i < this.textAux.length()) {
            if (this.textAux.substring(i, i + 1).equals(" ")) {
                this.textAux = this.textAux.substring(0, i) +
                    this.textAux.substring(i + 1, this.textAux.length());
            } else {
                i++; // Es equivalente a: i = i + 1 ó i += 1
            }
        }
        return this.textAux;
    }

    public boolean compareCharacters()
    {
        boolean sw = true; // Supuesto: el texto es palíndromo
        int i = 0;
        while (i < this.textAux.length() / 2 && sw) {
            if (this.textAux.substring(i, i + 1).equals(
                this.textAux.substring(this.textAux.length() - i - 1, this.textAux.length() - i))) {
                i++;
            } else {
                sw = false;
            }
        } 
        return sw;
    }

    
}
