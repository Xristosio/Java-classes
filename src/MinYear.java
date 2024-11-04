import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // Δηλώνει ότι το annotation αυτό μπορεί να εφαρμοστεί σε πεδία.
@Retention(RetentionPolicy.RUNTIME) //Δηλώνει ότι το annotation θα διατηρηθεί και στο runtime, ώστε να μπορεί να ελεγχθεί με reflection.
public @interface MinYear {
    int value();
}