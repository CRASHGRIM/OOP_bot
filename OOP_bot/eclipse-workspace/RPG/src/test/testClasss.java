package test;

import java.util.Random;
import java.util.Scanner;

public class testClasss {

	public static void hhh(String[] args) {
		Scanner in = new Scanner(System.in);
		var quizWordsList = new quizWords();
		Random rnd = new Random();
		//var dict = new answerDictionary();
		while(true)
		{
			String quizWord = quizWordsList.words.get(rnd.nextInt(quizWordsList.words.size()));
			StringBuilder answerWord = new StringBuilder();
			for (int i=0; i<quizWord.length(); i++)
				answerWord.append(".");
			System.out.println("����� ���������� �� ������� ���� �����");
			String inputMain = in.next().toString();
			String inputMainLower = inputMain.toLowerCase();
			if( inputMainLower.equals("exit"))
			{
				System.out.println("bye");
				break;
			}
			while (true)
			{
				System.out.println(answerWord);
				System.out.println("����� ��������");
				String input = in.next().toString();
				String inputLower = input.toLowerCase();
				if( inputLower.equals("exit"))
				{
					System.out.println("bye");
					break;
				}
				if (inputLower.length()!=1)
					System.out.println("�� ��� �� �� �����!");
				else
				{
					if (quizWord.contains(inputLower))
					{
						System.out.println("���� ����� �����!!!");
						for(int i=0;i<quizWord.length();i++)
							if(quizWord.charAt(i)==inputLower.charAt(0))
								answerWord.setCharAt(i, inputLower.charAt(0));
					}
					else
					{
						System.out.println("� ����� ����� ����� ����");
					}
				}
			}
		}
		System.out.println("End Of Conversartion");
		in.close();

	}

}
