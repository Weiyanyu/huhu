package top.yeonon.huhuqaservice.service;

import top.yeonon.huhucommon.exception.HuhuException;
import top.yeonon.huhuqaservice.vo.question.request.*;
import top.yeonon.huhuqaservice.vo.question.response.*;

/**
 * @Author yeonon
 * @date 2019/4/19 0019 18:59
 **/
public interface IQuestionService {

    /**
     * 创建一个问题
     * @param request 请求对象
     * @return 响应对象
     * @throws HuhuException 可能抛出的异常
     */
    QuestionCreateResponseVo createQuestion(QuestionCreateRequestVo request) throws HuhuException;


    /**
     * 根据ID获取问题信息（并不是搜索，搜索另外做）
     * @param request 请求对象
     * @return 响应对象
     * @throws HuhuException 可能抛出的异常
     */
    QuestionQueryResponseVo queryQuestion(QuestionQueryRequestVo request) throws HuhuException;


    /**
     * 更改问题信息（仅标题和内容）
     * @param request 请求对象
     * @return 响应对象
     * @throws HuhuException 可能抛出的异常
     */
    QuestionUpdateResponseVo updateQuestion(QuestionUpdateRequestVo request) throws HuhuException;


    /**
     * 删除问题（实际上只是关闭问题，并不真正删除，该问题下的答案也不删除，但应该禁止添加新答案了）
     * @param request 请求对象
     * @return 响应对象
     * @throws HuhuException 可能抛出的异常
     */
    QuestionDeleteResponseVo deleteQuestion(QuestionDeleteRequestVo request) throws HuhuException;


    /**
     * 查询所有（其实只是返回题目信息而已）
     * @param request 请求
     * @return  响应
     *
     */
    QuestionQueryAllResponseVo queryAll(QuestionQueryAllRequestVo request);

    /**
     * 关注问题
     * @param request 请求
     * @throws HuhuException 可能抛出的异常
     */
    void followQuestion(QuestionFollowRequestVo request) throws HuhuException;

    /**
     * 取消关注某问题
     * @param request 请求
     * @throws HuhuException 可能抛出的异常
     */
    void unFollowQuestion(QuestionUnFollowRequestVo request) throws HuhuException;
}
