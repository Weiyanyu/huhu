package top.yeonon.huhusearchservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.yeonon.huhucommon.exception.HuhuException;
import top.yeonon.huhusearchservice.service.ISearchService;
import top.yeonon.huhusearchservice.vo.request.GeneralSearchRequestVo;
import top.yeonon.huhusearchservice.vo.response.SearchAnswerResponseVo;
import top.yeonon.huhusearchservice.vo.response.SearchQuestionResponseVo;
import top.yeonon.huhusearchservice.vo.response.SearchUserResponseVo;

/**
 * @Author yeonon
 * @date 2019/4/30 0030 17:22
 **/
@RestController
@RequestMapping("search")
public class SearchController {

    private final ISearchService searchService;

    @Autowired
    public SearchController(ISearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("question")
    public SearchQuestionResponseVo searchQuestion(@RequestBody GeneralSearchRequestVo request) throws HuhuException {
        return searchService.searchQuestion(request);
    }

    @GetMapping("answer")
    public SearchAnswerResponseVo searchAnswer(@RequestBody GeneralSearchRequestVo request) throws HuhuException {
        return searchService.searchAnswer(request);
    }

    @GetMapping("user")
    public SearchUserResponseVo searchUser(@RequestBody GeneralSearchRequestVo request) throws HuhuException {
        return searchService.searchUser(request);
    }
}
