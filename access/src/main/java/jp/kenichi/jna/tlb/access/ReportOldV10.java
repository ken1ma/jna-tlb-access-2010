
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({ECD1EADA-D373-11D3-8D21-0050048383FB})</p>
 * <p>source(_ReportEvents)</p>
 * <p>interface(_Report2)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{ECD1EADA-D373-11D3-8D21-0050048383FB}")
public interface ReportOldV10 extends IUnknown
    ,_Report2
    ,IConnectionPoint
{

}