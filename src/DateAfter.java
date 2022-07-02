import java.util.Date;

public class DateAfter {

	public static void main(String[] args) {
		Date d = new Date(1978,05,20);
        Date d1 = new Date(2021,5,15);
        System.out.println(d.after(d1));
	}
}

/*
import java.util.Date;

public class DateAfter {

	public static void main(String[] args) {
		Date d = new Date(1978,05,20);
        Date d1 = new Date(2021,5,15);
        System.out.println(d.before(d1));
	}

}
*/