import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.LOCAL_VARIABLE})
@interface Company {
	String name();
	String location();
}