package top.yeonon.huhusearchservice.vo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import top.yeonon.huhucommon.request.RequestVo;

/**
 * @Author yeonon
 * @date 2019/5/5 0005 18:20
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutoCompletionRequestVo implements RequestVo {

    private String input;

    private String suggestName;

    private String[] indices;

    public boolean validate() {
        return StringUtils.isNotEmpty(input)
                && ArrayUtils.isNotEmpty(indices)
                && StringUtils.isNotEmpty(suggestName);
    }

}
