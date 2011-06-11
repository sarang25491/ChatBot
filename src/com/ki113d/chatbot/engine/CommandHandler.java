package com.ki113d.chatbot.engine;

import com.ki113d.chatbot.util.BasicUtils;

/**
 *
 * @author Ki113d
 */
public class CommandHandler {

    private BasicUtils bUtil = new BasicUtils();

    public String time(String line) throws Exception {
        String time = null;
        int zone = 0;
        
        if (line.length() > 5) {
            zone = Integer.valueOf(line.substring(line.indexOf("!time ")));
            if (zone < 13 && zone > -12) {
                time = bUtil.getTime(zone);
            } else {
                throw new Exception("Time zone is invalid!");
            }
        } else {
            time = "The time here is " + bUtil.getTime();
        }

        return time;
    }
}
