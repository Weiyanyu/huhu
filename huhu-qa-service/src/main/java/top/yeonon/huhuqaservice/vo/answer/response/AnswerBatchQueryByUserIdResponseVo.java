package top.yeonon.huhuqaservice.vo.answer.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @Author yeonon
 * @date 2019/4/21 0021 13:14
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswerBatchQueryByUserIdResponseVo {

    private List<AnswerInfo> answerInfoList;

    private Integer pageNum;

    private Integer pageSize;

    private boolean hasNext;

    private boolean hasPrevious;

    private boolean isFirst;

    private boolean isLast;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AnswerInfo {
        private Long id;
        private String content;
        private Long approvalCount;
        private Long commentCount;
        private Long questionId;
        private String questionTitle;
        private Integer status;
        private Date createTime;
        private Date updateTime;
    }


}
