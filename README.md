# HEX2RGB

Écrire une méthode qui convertit une couleur en hexadécimal vers une couleur en RGB.

Si la couleur est #FF44BB, il faut ignorer le '#', les 2 premiers caractères correspondent au rouge, les deux suivants au vert et les deux derniers au bleu.

Pour convertir de l’hexa vers le decimal, tu peux utiliser la méthode de conversion de base 16 suivante : Integer.parseInt(hexValue, 16);

Vérifier que le paramètre rentré correspond bien à une couleur en hexa (c’est à dire 6 caractères entre 0-9 et A-F, précédé par un #), retourner une Exception sinon.

### Exemples :

	entrée     sortie
	#ff0000    [255, 0, 0]
	ff0000     null
	#56E1B4    [86, 225, 180]

Rappel des commande junit :

    javac -cp .:junit-4.12.jar Hex2RgbTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore Hex2RgbTest
