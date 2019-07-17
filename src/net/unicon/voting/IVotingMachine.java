package net.unicon.voting;

/**
 * Public interface for a voting machine. Implementations are not specified such as:
 * <li> Rules for determining a winner
 * <li> Performance / likely usage of this system
 *
 */
public interface IVotingMachine {
    /**
     * Process a vote for the candidate represented by the given string.
     *
     * <p>All non-null, non-whitespace candidate identifiers are valid.</p>
     *
     * @param candidate A candidate identifier. Leading and trailing whitespace 
     * should be ignored.
     */
    public void vote(String candidate);
     
    
    /**
     * Return the string key representing the candidate
     * who would be considered the winner, were no
     * further invocations of {@link #vote(String)}
     * to occur.
     *
     * <p>The semantics of "winner" are not specified
     * by this API. That is, the conditions for
     * winning vary by election type and are thus
     * implementation- and/or configuration-dependent.</p>
     *
     * @return a candidate identifier for the election
     *   winner, or null if no candidate can be
     *   considered the winner.
     */
    public String getWinner();
    
     
    /**
     * Output the current state of voting sorted by vote count
     * in descending order - CSV format.
     *
     * <p>The following example specifies the expected
     * content with several sample candidates.</p>
     *
     * CANDIDATE,VOTES,WINNER
     * Bruce Banner,15,Y
     * Betty Ross,5,N
     * Lyra,2,N
     * Skaar,1,N
     *
     * <p>A machine with no results should produce an empty table</p>
     */
    public void printResults();
}
