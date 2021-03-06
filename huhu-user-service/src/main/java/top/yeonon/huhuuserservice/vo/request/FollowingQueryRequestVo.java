package top.yeonon.huhuuserservice.vo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.yeonon.huhucommon.request.RequestVo;
import top.yeonon.huhucommon.utils.CommonUtils;

/**
 * @Author yeonon
 * @date 2019/4/15 0015 13:02
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FollowingQueryRequestVo implements RequestVo {

    private Long id;

    public boolean validate() {
        return CommonUtils.checkId(id);
    }
}
