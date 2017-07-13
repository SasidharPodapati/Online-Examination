package sasidhar.bth.App.process;

import sasidhar.bth.App.db.entity.UserExamScore;

import java.util.List;

public interface UserExamScoreProcess {
    UserExamScore findbyId(Integer id);
    Integer  updateResult(UserExamScore userExamScore);
    List<UserExamScore> findByUserId(Integer userId);
    UserExamScore create(UserExamScore userExamScore);
}
