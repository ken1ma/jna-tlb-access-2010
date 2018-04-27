
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({FF240263-AF0A-432D-A544-A721E75738F8})</p>
 * <p>source(_ReportEvents2)</p>
 * <p>source(_ReportEvents)</p>
 * <p>interface(_Report3)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{FF240263-AF0A-432D-A544-A721E75738F8}")
public interface Report extends IUnknown
    ,_Report3
    ,IConnectionPoint
{

}