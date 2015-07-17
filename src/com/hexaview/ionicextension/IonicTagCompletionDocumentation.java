/*
 *This class provide the documentation content by matching the item  
 */
package com.hexaview.ionicextension;

/**
 *
 * @author Sampat-Hexaview
 */
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Action;
import org.netbeans.spi.editor.completion.CompletionDocumentation;
import org.openide.util.Exceptions;

public class IonicTagCompletionDocumentation implements CompletionDocumentation {

    private IonicTagCompletionItem item;

    public IonicTagCompletionDocumentation(IonicTagCompletionItem item) {
        this.item = item;
    }

    public String getText() {
        StringBuilder sb = new StringBuilder();
        String title=item.getText();
        if(title.charAt(0)=='<')
            title=item.getText().substring(1, item.getText().length()-1);
        String docs=IonicTagData.getDocs(title);
        sb.append("<h1>").append(title).append("</h1>").append("<br>");
	sb.append(docs);
        return sb.toString();
    }

    public URL getURL() {
        URL url = null;
        try {
            url = new URL("http://www.netbeans.org");
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        }
        return url;
    }

    public CompletionDocumentation resolveLink(String string) {
        return null;
    }

    public Action getGotoSourceAction() {
        return null;
    }
    
}
