
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({97A2762C-403C-4953-A121-7A75ABCE4373})</p>
 * <p>interface(_Group)</p>
 */
@ComObject(clsId = "{97A2762C-403C-4953-A121-7A75ABCE4373}")
public interface Group extends IUnknown
    ,_Group
{

}