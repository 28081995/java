package com.bridgelabz;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Listner
 *
 */
@WebListener
public class Listner implements ServletRequestListener {
	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
    	System.out.println("request Destroyed "+arg0.getServletRequest().getRemoteAddr());
    	//System.out.println("request Destroyed "+arg0.getServletRequest().getServerName());
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
    	System.out.println("request Initialized "+arg0.getServletRequest().getRemoteAddr());
    	//System.out.println("request Initialized "+arg0.getServletRequest().getContentType());
    }
}
