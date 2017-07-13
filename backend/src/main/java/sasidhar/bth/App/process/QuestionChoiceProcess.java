package sasidhar.bth.App.process;

import sasidhar.bth.App.db.entity.QuestionChoice;
import java.util.List;

public interface QuestionChoiceProcess {
    int create(List<QuestionChoice> questionChoice);
    List<Integer> find(int question_id);
    void deleteByChoiceId(int choice_id);
    void deleteByQuestionId(int question_id);


}
