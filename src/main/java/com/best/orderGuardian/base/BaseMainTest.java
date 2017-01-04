package com.best.orderGuardian.base;

import static org.junit.Assert.fail;

import java.io.InputStream;

import org.junit.Before;
import org.junit.Ignore;

/**
 * 
 * 单元测试业务基类
 * @author bl00817
 * 
 */
@Ignore
public class BaseMainTest extends BaseTestSupport {

    /**
     * 用户。
     */
    protected final String superAdministorUserCode = "Ethan Chen";
    protected final Long superAdministorUserId = 1L;
    protected final String password = "abc123";
    protected final String superAdministorUserName = "Ethan.D Chen";
    protected final String superAdministorUserEmail = "dlchen@800best.com";


    @Before
    public void init() {
        fakeContext();
    }

    /**
     * 伪造上下文
     */
    private void fakeContext() {
        
    }

    /**
     * 读取配置文件
     * @param xml,txt
     * @return
     */
    protected String readFileData(String file) {
        StringBuilder sb = new StringBuilder();
        try (InputStream is = this.getClass().getResourceAsStream(file)) {
            int Byte;
            while ((Byte = is.read()) != -1) {
                sb.append((char) Byte);
            }
        } catch (Exception ex) {
            fail();
        }
        return sb.toString();
    }

}

