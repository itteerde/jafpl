/**
 * 
 */
package jafpl;

/**
 * @author Erik Itter
 *
 */
public class MonoalphabeticSubstitution {

	public static String substitute(String s, char[] mapping) {
		String t = s.toUpperCase();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < t.length(); i++) {
			sb.append(mapping[t.charAt(i) - 'A']);
		}
		return sb.toString();
	}
}
