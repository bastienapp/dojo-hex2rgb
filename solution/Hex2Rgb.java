class Hex2Rgb {

	public static int[] convert(String hexa) {
		int colors[] = new int[3];
		if (hexa.length() == 7) {
			String hash = hexa.substring(0, 1);
			if (hash.equals("#")) {
				String red = hexa.substring(1, 3);
				colors[0] = Integer.parseInt(red, 16);
				String green = hexa.substring(3, 5);
				colors[1] = Integer.parseInt(green, 16);
				String blue = hexa.substring(5, 7);
				colors[2] = Integer.parseInt(blue, 16);
			} else {
				return null;
			}
		} else {
			return null;
		}
		return colors;
	}
}