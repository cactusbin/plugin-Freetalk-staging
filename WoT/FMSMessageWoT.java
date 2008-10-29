/* This code is part of Freenet. It is distributed under the GNU General
 * Public License, version 2 (or at your option any later version). See
 * http://www.gnu.org/ for further details of the GPL. */
package plugins.FMSPlugin.WoT;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import freenet.keys.FreenetURI;
import freenet.support.DoublyLinkedList;
import plugins.FMSPlugin.FMSBoard;
import plugins.FMSPlugin.FMSIdentity;
import plugins.FMSPlugin.FMSMessage;

/**
 * @author xor
 *
 */
public class FMSMessageWoT extends FMSMessage {

	public FMSMessageWoT(FreenetURI newURI, FreenetURI newParentURI, Set<FMSBoard> newBoards, FMSIdentity newAuthor, String newTitle,
			Date newDate, String newText, List<FreenetURI> newAttachments) {
		super(newURI, newParentURI, newBoards, newAuthor, newTitle, newDate, newText, newAttachments);
		// TODO Auto-generated constructor stub
	}


}
