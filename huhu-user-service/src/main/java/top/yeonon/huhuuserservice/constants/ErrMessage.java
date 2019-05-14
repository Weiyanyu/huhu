package top.yeonon.huhuuserservice.constants;

/**
 * @Author yeonon
 * @date 2019/4/14 0014 15:39
 **/
public class ErrMessage {

    public static final String REQUEST_PARAM_ERROR = "请求参数错误";

    public static final String EXIST_SAME_USERNAME = "存在同名用户";

    public static final String NOT_FOUND_USER = "找不到该用户";

    public static final String ALREADY_CLOSE_USER = "该用户已经注销";

    public static final String NOT_ALLOW_FOLLOW_YOURSELF = "不允许关注自己";

    public static final String NOT_ALLOW_UN_FOLLOW_YOURSELF = "不允许取消关注自己";

    public static final String NOT_EXIST_FOLLOW_RELATION = "双方不存在任何关注关系";

    public static final String EXIST_FOLLOW_RELATION = "双方已存在关注关系";

    public static final String NOT_ALLOW_ACTION = "禁止越权行为";

    public static final String USERNAME_NOT_MATCH_EMAIL = "用户名和邮箱不匹配";

    public static final String VALIDATE_CODE_ERROR = "验证码错误";

    public static final String NOT_EXIST_TOKEN_IN_HEADER = "Header里不存在Token";

}
