package top.yeonon.huhuqaservice.vo.question.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.yeonon.huhucommon.request.RequestVo;

/**
 * @Author yeonon
 * @date 2019/4/20 0020 16:07
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDeleteRequestVo implements RequestVo {

    private Long id;

    private Long userId;

    public boolean validate() {
        return id != null
                && id > 0
                && userId != null
                && userId > 0;
    }

}
