package pkuhit.xap.ac;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import xap.sv.annotation.Service;
import xap.sv.model.ArrayResult;
import xap.sv.model.SingleResult;
import xap.sv.servlet.mvc.annotation.ModelAttribute;
import xap.sv.servlet.mvc.annotation.RequestParam;

@Service
public interface PatientService
{
    /**
     * 
     * @description 新建患者
     * @author ad
     * @param patient
     * @return
     */
    @RequestMapping(value = "/patient", method = RequestMethod.POST)
    Patient create(@ModelAttribute Patient patient);
    
    /**
     * 
     * @description 更新患者
     * @author ad
     * @param patient
     * @return
     */
    @RequestMapping(value = "/patient/{id}", method = RequestMethod.PUT)
    SingleResult<Patient> update(@PathVariable("id") String patientId, @ModelAttribute Patient patient);
   
    /**
     * 
     * @description 删除患者
     * @author ad
     * @param patient
     * @return
     */
    @RequestMapping(value = "/patient/{id}", method = RequestMethod.DELETE)
    String delete(@PathVariable("id") String patientId);
    
    /**
     * 
     * @description 查询单个患者详细信息
     * @author ad
     * @param patient
     * @return
     */
    @RequestMapping(value = "/patient/{id}", method = RequestMethod.GET)
    SingleResult<Patient> selectPatientById(@PathVariable("id") String patientId);
    
    /**
     * map中key值：
     * 1、orgCd：机构的code，用于根据机构code查询用户列表。
     * 2、statusCd：用户状态，表示启用不启用等。
     * 3、userId：用户名。
     * 4、name：用户姓名。
     * @description 查询用户
     * @author jiao_xiantong
     * @date 2014年12月12日 上午10:42:06
     * @param params
     * @return
     */
    @RequestMapping(value = "/patients", method = RequestMethod.GET)
    ArrayResult<Patient> search(@RequestParam Map<String, String> params);
   
}
