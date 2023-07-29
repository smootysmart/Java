package midtermtest.util_noppakrit;

import java.util.Comparator;
import java.util.function.Predicate;

public class CommentPlus032 extends Comment {

    private final int extraNumber;

    private final Grade032 grade032;

    public CommentPlus032(String message, Grade032 grade) {
        super(message == null ? "NO_COMMENT" : message);
        this.extraNumber = 0;
        this.grade032 = grade == null ? Grade032.NONE : grade;
    }

    public CommentPlus032(String message, int extraNumber, Grade032 grade032) {
        super(message == null ? "NO_COMMENT" : message);
        this.extraNumber = 0;
        this.grade032 = grade032 == null ? Grade032.NONE : grade032;
    }

    // getter
    // public int getExtraNumber(){
    // return extraNumber;
    // }

    public Grade032 getGrade032() {
        return grade032;
    }

    @Override
    public String getContent() {
       return super.getContent() + (grade032 != null ? grade032.toString() : "");
    }

    public static final Comparator<CommentPlus032> GRADE032_COMPARATOR = Comparator
            .comparing(CommentPlus032::getGrade032);

    public static Predicate<CommentPlus032> match999(Grade032 grade) {
        return comment -> comment.getGrade032().equals(grade);
    }
}
