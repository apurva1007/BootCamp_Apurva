import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.LOCAL_VARIABLE,ElementType.METHOD})
@interface Timestamp {
	Day day();
	Month month();
	Year year();
}
