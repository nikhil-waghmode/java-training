package day7.lambda.assignment;
/*
Write Lambda expressions for the following cases:
a. Convert string to title case.
b. Convert string to camel case.
c. Remove spaces from string.
d. Count number of vowels in a string.
e. Count number of consonants in a string
f. Count number of alphabets in a string
g. Count number of words in a string

Before you start the code, think on the following points:
a. Identify the data types of ins' and outs' for the above cases.
b. How many functional interfaces are required?
c. Can we use Generics and reduce the number of functional interfaces?
*/
@FunctionalInterface
interface StringLibraryOne {
	String convert(String s);
}
