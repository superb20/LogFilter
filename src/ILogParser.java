import java.awt.Color;

/**
 * 
 */


/**
 * 
 */
public interface ILogParser
{
    int TYPE_ANDROID_DDMS   = 0;
    int TYPE_ANDROID_LOGCAT = 1;
    
    LogInfo parseLog(String strText);
    Color   getColor(LogInfo logInfo);
    int     getLogLV(LogInfo logInfo);
}
