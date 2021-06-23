package org.wltea.analyzer.dic;

import org.apache.logging.log4j.Logger;
import org.wltea.analyzer.help.ESPluginLoggerFactory;

/**
 * @author wmx
 * @version 1.0
 * @ClassName HotDict
 * @Description
 * @date 2021/5/26 21:58
 */
public class HotDictReloadThread {
    private static final Logger log = ESPluginLoggerFactory.getLogger(HotDictReloadThread.class.getName());
    public void initial(){
        while (true) {
            log.info("正在调用HotDictReloadThread...");
            Dictionary.getSingleton().reLoadMainDict();
        }
    }
}
