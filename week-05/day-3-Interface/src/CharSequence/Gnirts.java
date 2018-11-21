package CharSequence;
/*Create a Gnirts class implementing this interface
    -It should have one String field that can be set via the constructor
    -Implementing the interfaces methods always think of the field as backwards, so at the second position of "this example" there is a 'p'
    In a main method try out all the methods*/

import java.util.Comparator;

public class Gnirts implements CharSequence {
  String text;

  Gnirts() {

  }

  Gnirts(String text) {
    this.text = text;
  }

  @Override
  public int length() {
    //int size = this.length();
    return this.text.length();
  }

  @Override
  public char charAt(int index) {
    return charAt(this.text.length()-1- index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    CharSequence toReturn = new StringBuilder();
    for (int i = this.text.length()-1- start; i < this.text.length()-1- end; i++) {
      ((StringBuilder) toReturn).append(charAt(i));
    }
    return toReturn;
  }
}
