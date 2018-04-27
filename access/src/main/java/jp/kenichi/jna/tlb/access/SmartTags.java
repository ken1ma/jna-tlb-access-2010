
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({73778F0A-9743-4DF3-BBFA-941712488FEA})</p>
 * <p>interface(_SmartTags)</p>
 */
@ComObject(clsId = "{73778F0A-9743-4DF3-BBFA-941712488FEA}")
public interface SmartTags extends IUnknown
    ,_SmartTags
{

}