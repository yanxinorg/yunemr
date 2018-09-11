package jhmk.clinic.cms.controller.testController;

import jhmk.clinic.cms.controller.ruleService.SyzdService;
import jhmk.clinic.cms.service.Write2File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * @author ziyu.zhou
 * @date 2018/9/11 15:07
 */
@Controller
@RequestMapping("/test/dis")
public class MainDisController {
    @Autowired
    SyzdService syzdService;

    //获取出院主诊断+个数
    @PostMapping("/getAllData")
    public void getAllData(HttpServletResponse response) {
        Map<String, Integer> allData = syzdService.getAllData();
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(allData.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : entries) {
            list.add(entry.getKey() + "/" + entry.getValue());
        }
        Write2File.w2fileList(list,"/data/1/CDSS/allData.txt");
    }
}