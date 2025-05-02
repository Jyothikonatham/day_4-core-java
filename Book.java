public class Book{
	public String displayInfo(String libraryName,String title,String author){
		return "Library Name :" + libraryName +"\nBook Title :" + title +"\nBook Author :" + author;
	}
	public static void main(String[] args){
		Book book = new Book();
		String details1 = book.displayInfo("City Public Library","The Great Gatsby","F. Scott Fitzgerald");
		System.out.println(details1);
		String details2 = book.displayInfo("City Public Library","1984","George Orwell");
		System.out.println(details2);

	}
}