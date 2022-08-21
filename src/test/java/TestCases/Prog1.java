package TestCases;


public class Prog1 {
	
	public static void main(String[] args) {
		1)Reverse String 

	String name="jitendra";
			char ch;
			String rev="";
			System.out.println(name.length());
			for(int a=name.length()-1;a>=0;a--)
			{
				ch=name.charAt(a);
				rev=rev+ch;
			}
			System.out.println(rev);
		}
	}

	2)Reverse Number

	int num=12345;
			char ch;
			String rev="";
			String revnum=Integer.toString(num);
			System.out.println(revnum.length());
			for(int a=revnum.length()-1;a>=0;a--)
			{
				ch=revnum.charAt(a);
				rev=rev+ch;
			}
			System.out.println(rev);
		}

	}

	3) Addition of number
	int num=12345;
			int rem;
			int sum=0;
			String  num1=Integer.toString(num);
			System.out.println(num1);
			while(num>0)
			{
				rem=num%10;
				num=num/10;
				sum=sum+rem;	
			}
			System.out.println(sum);
		}
	}
	4) count of number in Repeated letter in String

	String name="jitendrajadhavjava";
			int count=name.length();
			int newcount=name.replaceAll("j", "").length();
		int value=count-newcount;
		System.out.println(value);


	5) Split sentence

	String name="jitendra gorakhanath jadhav";
			String splitsentence[]=name.split(" ");
			System.out.println(splitsentence.length);
			for(int a=0;a<=splitsentence.length-1;a++)
			{
				System.out.print(splitsentence[a]+" ");
			}	
		}
		
	}


	6)PalindromeString 

	String str="Don't take revenge. let Karma do all the work";
			 char ch;
			 String rev="";
			for(int a=str.length()-1;a>=0;a--)
			{
				ch=str.charAt(a);
				rev=rev+ch;
			}
			System.out.println(rev);
			if(str.equals(rev))
			{
				System.out.println("String is palindrome");
			}
			else
			{
				System.out.println("Not Palindrome");
			}
		}
		
	}

	7) Differentiate numbers and characters from String

	String place="jitendra859192jadhav8163";
			String num="";
			String word="";
			for(int a=0;a<=place.length()-1;a++)
			{
				if(Character.isDigit(place.charAt(a)))
				{
					num=num+place.charAt(a);
				}
				else
				{
				
					word=word+place.charAt(a);
				}
			}
			
			System.out.println(num);
			System.out.println(word);
			
		}	
	}

	8) Swapping number
	int a=10;
			int b=20;
			
			int t=a;
			a=b;
			b=t;
			System.out.println(a);
			System.out.println(b);
		}	
	}
	 int a=10;
			int b=20;
			a=a+b; 
			b=a-b; 
			a=a-b;  
			System.out.println(a);
			System.out.println(b);
		}	
	}
	int a=10;
			int b=20;
			a=a*b;
			b=a/b;
			a=a/b;
			System.out.println(a);
			System.out.println(b);
		}	
	}
	int a=10;
			int b=20;
			a=a^b;
			b=a^b;
			a=a^b;
			System.out.println(a);
			System.out.println(b);
		}	
	}
	int a=10;
			int b=20;
			b=a+b-(a=b);
			System.out.println(a);
			System.out.println(b);
		}	
	}
	9)  Count the number of digit in number
	int num=12020202;
			int count=0;
			while(num>0)
			{
				num=num/10;
				count++;
			}
			System.out.println(count);
			
		}	
	}
	10) count odd and even number from number

	int num=123456789;
			int rem;
			int evencount=0;
			int oddcount=0;
					while(num>0)
					{
						rem=num%10;
						if(rem%2==0)
						{
							evencount++;	
						}
						else
						{
							oddcount++;
						}
						num=num/10;
					}
			System.out.println(evencount);
			System.out.println(oddcount);
		}
		
	}
	11)greater number from 3 numbers
	System.out.println("enter 1st number");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();;
			System.out.println("enter 2nd number");
			int b=sc.nextInt();;
			System.out.println("enter 3rd number");
			int c=sc.nextInt();;
			if(a>b && a>c)
			{
				System.out.println("1st is graeter");
			}
			else if(b>a && b>c)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("c is greater");
				
		}
	}
	}
	int a=200; int b=40;
		int c=10;
		int large =a>b?a:b;
		large=c>large?c:large;
		System.out.println(large);
	 
	12) Fibonacchi series
	int a=0;int b=1;int sum=0;
			for(int i=2;i<10;i++)
			{
				sum=a+b;
				System.out.print(sum);
				a=b;
				b=sum;
			}
	12)Factorial 
	int num = 5;
			int fact = 1;
			for(int a=1;a<=num;a++)
			{
				fact=fact*a;
				
			}
			System.out.println(fact);	
		}
	}
	13) count the vowels in String
	String name="jitendra jadhav";
			int count=0;
			System.out.println(name.length());
			char ch[]=name.toCharArray();
			for (char c : ch)
			{
				switch(c)
				{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					break;	
				}	
		}
			System.out.println(count);
		}
	}
	14) Random number
	Random rn=new Random();
			int randnum=rn.nextInt(10);
			System.out.println(randnum);
			
		}
	}
	15) Prime Number

	int num=13;
			int count=0;
			if(num>1)
			{
				for(int a=1;a<=num;a++)
				{
					if(num%a==0)
						count++;
				}
					
					if(count==2)
					{
						System.out.println("prime");
					}
					else
					{
						System.out.println("not prime");
					}
				}
			}
		}
	16) Sum of array

	int [] num= {12,12,13,13,13};
			int sum=0;
			for(int a=0;a<num.length;a++)
			{
			sum=sum+num[a];
			}
			System.out.println(sum);
			}	
		}	

	17) odd and even number from Array

	int arr[]= {12,13,14,15,16,17};
			for(int a=0;a<arr.length;a++)
			{
				if(arr[a]%2==0)
					System.out.println(arr[a]);		
			}
			System.out.println("===========================");
			for(int a=0;a<arr.length;a++)
			{
				if(arr[a]%2!=0)
					System.out.println(arr[a]);		
			}
		}
	}
	18) comparing two array

	int a1[]= {1,2,3,4,5};
			int a2[]= {1,2,3,4,5};
			boolean status=Arrays.equals(a1, a2);
		if(status==true)
		{
			System.out.println("Arrays are same");
		}
		else
		{
			System.out.println("arrays not same");
		}
		}
	}int a1[]={1,2,3,4,5};
			int a2[]={1,2,3,4,5};
			
	boolean status=Arrays.equals(a1, a2);
	if(a1.length==a2.length )
	{
		for(int a=0;a<a1.length;a++)
		{
			if(a1[a]!=a2[a])
			{
			status=false;
			}
			else
			{
				status=true;
			}
		}
		if(status=true)
		{
			System.out.println("arrays are equal");
		}
		else
		{
			System.out.println("arryas are not equal");
		}
	}
			}
	}
	19) Missing numbers in arrays
	int a1[]= {1,2,3,5};
			int sum1=0;
			int sum2=0;
			for(int a=0;a<a1.length;a++)
			{
				sum1=sum1+a1[a];
			}
			System.out.println(sum1);
			for(int i=1;i<=5;i++)
			{
				sum2=sum2+i;
				
			}
			System.out.println(sum2);
			System.out.println("missing number="+(sum2-sum1));
			}
	}
	20) Maximum Number in Array

	int arr[]= {12,13,14,15,16,9};
			int min=arr[0];
			for(int a=0;a<arr.length;a++)
			{
				if(arr[a]<min)
				{
					min=arr[a];
				}
			}
			System.out.println(min);
		}
	}

	21) Find Duplicate value in Array

	int arr[]= {12,13,14,12,15,15,16,9};
			for(int a=0;a<arr.length;a++)
			{
				for(int b=a+1;b<arr.length;b++)
				{
					if(arr[a]==arr[b])
					{
						System.out.println("duplicate value="+ arr[a]);
					}
				}	
		}
		}
	String str[]= {"java","python","c++","java","selenium"};
			HashSet hs=new HashSet();
			for(int a=0;a<str.length;a++)
			{
			hs.add(str[a]);
			
			}
			System.out.println(hs);
		}
	}
	22) Search element in array

	String str[]= {"java","python","c++","java","selenium"};
			String search="1-000";
			boolean flag=false;
			for(int a=0;a<str.length;a++)
			{
				if(search==str[a])
				{
					System.out.println("element found="+ a);
					flag=true;
					break;
				}
			}
		if(flag==false)
		{
			System.out.println("not found");
		}
	}
	}
	23) reverse order arraay and sort the arrays

	Integer arr[]= {12,13,12,10,29};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		}	
	}
	24) Remove special charaacter from String

	String name="@#$%^%hjadhdJSKS&*&&J78766";
			String s=name.replaceAll("[^a-zA-Z0-9]","");
			System.out.println(s);

		}	
	}
	25) Remove all White Spaces from String 

	String name="java     selenium     jira    ";
			System.out.println(name.replaceAll("\\s", ""));
		}	
	}
	26) Count occureance in String

	String name="jitendrajadhav";
			int str=name.length();
			int str1 = name.replaceAll("[a,e,i,o,u]", "").length();
			int value=str-str1;
			System.out.println(str-str1);	
		}
	}

		
	}
		}
			
