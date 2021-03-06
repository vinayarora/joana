// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g 2013-10-30 15:43:52
/**
 * This file is part of the Joana IFC project. It is developed at the
 * Programming Paradigms Group of the Karlsruhe Institute of Technology.
 *
 * For further details on licensing please read the information at
 * http://joana.ipd.kit.edu or contact the authors.
 */
package edu.kit.joana.ifc.sdg.graph;

import java.util.LinkedList;
import gnu.trove.set.TIntSet;
import gnu.trove.set.hash.TIntHashSet;
import edu.kit.joana.ifc.sdg.graph.slicer.graph.threads.ThreadsInformation;
import edu.kit.joana.ifc.sdg.graph.slicer.graph.threads.ThreadsInformation.ThreadInstance;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
 * This file is part of the Joana IFC project. It is developed at the
 * Programming Paradigms Group of the Karlsruhe Institute of Technology.
 *
 * For further details on licensing please read the information at
 * http://joana.ipd.kit.edu or contact the authors.
 */
public class SDG_Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NUMBER", "STRING", "WHITESPACE", "'{'", "'JComp'", "'}'", "'Thread'", "'Entry'", "';'", "'Exit'", "'Fork'", "'Join'", "'Context'", "'Dynamic'", "'null'", "'['", "','", "']'", "'SDG'", "'v'", "'NORM'", "'PRED'", "'EXPR'", "'ENTR'", "'CALL'", "'ACTI'", "'ACTO'", "'FRMI'", "'FRMO'", "'EXIT'", "'SYNC'", "'FOLD'", "'S'", "'B'", "'U'", "'P'", "'O'", "'V'", "'T'", "'Z'", "'N'", "'C'", "'A'", "'D'", "':'", "'-'", "'empty'", "'intconst'", "'floatconst'", "'charconst'", "'stringconst'", "'functionconst'", "'shortcut'", "'question'", "'binary'", "'unary'", "'derefer'", "'refer'", "'array'", "'select'", "'reference'", "'declaration'", "'modify'", "'modassign'", "'assign'", "'IF'", "'loop'", "'jump'", "'compound'", "'call'", "'entry'", "'exit'", "'form-in'", "'form-ellip'", "'form-out'", "'act-in'", "'act-out'", "'monitor'", "'DD'", "'DH'", "'DA'", "'CD'", "'CE'", "'UN'", "'CF'", "'NF'", "'RF'", "'CC'", "'CL'", "'PI'", "'PO'", "'SU'", "'SH'", "'SF'", "'PS'", "'FORK'", "'FORK_IN'", "'FORK_OUT'", "'JOIN'", "'ID'", "'IW'", "'SD'", "'HE'", "'FD'", "'FI'", "'RY'", "'JF'", "'SP'", "'VD'", "'RD'", "'JD'", "'true'", "'false'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__19=19;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int NUMBER=4;
    public static final int WHITESPACE=6;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__116=116;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=5;

    // delegate
    // delegator


        public SDG_Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SDG_Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return SDG_Parser.tokenNames; }
    public String getGrammarFileName() { return "/afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g"; }


      private SDGNode.NodeFactory nodeFact = new SDGNode.SDGNodeFactory();

      public void setNodeFactory(SDGNode.NodeFactory nodeFact) {
        this.nodeFact = nodeFact;
      }

      public void createNodesAndEdges(final SDG sdg, final List<SDGNodeStub> stubs) {
        // 1. create all node
        for (SDGNodeStub n : stubs) {
          final SDGNode node = n.createNode(nodeFact);
          sdg.addVertex(node);
        }

        // 2. create all edge
        for (SDGNodeStub n : stubs) {
          n.createEdges(sdg);
        }
      }

      // Stores always the last position specified by a previous node. This is used
      // for sane error recovery, when no position is defined for a node:
      // We assume that its position may be somewhat equal to its pred node.
      private static SourcePos defaultSrcPos = new SourcePos("undefined", 0, 0, 0, 0);
      private static ByteCodePos defaultBcPos = new ByteCodePos("<undefined>", -1);

      @Override
      public void reportError(final RecognitionException e) {
        super.reportError(e);
        Thrower.sneakyThrow(e);
      }

      /**
       * See "Puzzle 43: Exceptionally Unsafe" from Bloch Gafter, <i>Java Puzzlers</i>. Addison Wesley 2005.
       */
      static class Thrower {
        private static Throwable t;
        private Thrower() throws Throwable {
          throw t;
        }
        public static synchronized void sneakyThrow(final Throwable t) {
          Thrower.t = t;
          try {
            Thrower.class.newInstance();
          } catch (InstantiationException e) {
            throw new IllegalArgumentException(e);
          } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
          } finally {
            Thrower.t = null; // Avoid memory leak
          }
        }
      }

      static class SDGHeader {
        private int version;
        private String name;

        private SDGHeader(int version, String name) {
          this.version = version;
          this.name = name;
        }

        private SDG createSDG() {
          SDG sdg = (name == null ? new SDG() : new SDG(name));
          return sdg;
        }

        public String toString() {
          return "SDG of " + name + " (v" + version + ")";
        }
      }

      static final class SDGNodeStub {

        private final SDGNode.Kind kind;
        private final int id;
        private SourcePos spos;
        private ByteCodePos bpos;
        private int procId;
        private SDGNode.Operation op;
        private String val;
        private String type;
        private TIntSet threadNums;
        private boolean nonTerm = false;
        private String unresolvedCallTarget;
        private String classLoader;
        private TIntSet allocSites;
        private TIntSet aliasDataSrc;
        private final List<SDGEdgeStub> edges = new LinkedList<SDGEdgeStub>();

        private SDGNodeStub(final SDGNode.Kind kind, final int id, SourcePos defSPos, ByteCodePos defBPos) {
          this.kind = kind;
          this.id = id;
          this.spos = defSPos;
          this.bpos = defBPos;
        }

        private static int findKindId(final SDGNode.Operation op, final SDGNode.Kind kind) {
          final SDGNode.Kind[] kinds = op.getCorrespondingKind();
          for (int id = 0; id < kinds.length; id++) {
            if (kind == kinds[id]) {
              return id;
            }
          }

          // shoud not happen - default to first kind
          return 0;
        }

        private SDGNode createNode(final SDGNode.NodeFactory nf) {
          final int kindId = findKindId(op, kind);
          final SDGNode n = nf.createNode(op, kindId, id, val, procId, type, spos.filename,
            spos.startRow, spos.startColumn, spos.endRow, spos.endColumn, bpos.name, bpos.index);

          if (threadNums != null) {
            n.setThreadNumbers(threadNums.toArray());
          }

          if (nonTerm) {
            n.setMayBeNonTerminating(true);
          }

          if (classLoader != null) {
            n.setClassLoader(classLoader);
          }

          if (allocSites != null) {
            n.setAllocationSites(allocSites.toArray());
          }

          if (aliasDataSrc != null) {
            n.setAliasDataSources(aliasDataSrc);
          }

          if (unresolvedCallTarget != null) {
            n.setUnresolvedCallTarget(unresolvedCallTarget);
          }
          return n;
        }

        private void createEdges(final SDG sdg) {
          final SDGNode from = sdg.getNode(id);

          for (final SDGEdgeStub e : edges) {
            final SDGNode to = sdg.getNode(e.to);
            final SDGEdge edge = (e.label != null
              ? new SDGEdge(from, to, e.kind, e.label)
              : new SDGEdge(from, to, e.kind));

            sdg.addEdge(edge);
          }
        }
      }

      static final class SourcePos {

        private final String filename;
        private final int startRow;
        private final int startColumn;
        private final int endRow;
        private final int endColumn;

        private SourcePos(final String filename, final int startRow, final int startColumn,
            final int endRow, final int endColumn) {
            this.filename = filename;
            this.startRow = startRow;
            this.startColumn = startColumn;
            this.endRow = endRow;
            this.endColumn = endColumn;
        }
      }

      static final class ByteCodePos {

        private final String name;
        private final int index;

        private ByteCodePos(final String name, final int index) {
          this.name = name;
          this.index = index;
        }

      }

      static final class SDGEdgeStub {

        private final SDGEdge.Kind kind;
        private final int to;
        private String label;

        private SDGEdgeStub(final SDGEdge.Kind kind, final int to) {
          this.kind = kind;
          this.to = to;
        }
      }



    // $ANTLR start "sdg_file"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:269:1: sdg_file returns [SDG sdg] : head= sdg_header '{' ( 'JComp' )? nl= node_list (ti= thread_info[sdg] )? '}' ;
    public final SDG sdg_file() throws RecognitionException {
        SDG sdg = null;

        SDGHeader head = null;

        List<SDGNodeStub> nl = null;

        ThreadsInformation ti = null;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:270:3: (head= sdg_header '{' ( 'JComp' )? nl= node_list (ti= thread_info[sdg] )? '}' )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:270:5: head= sdg_header '{' ( 'JComp' )? nl= node_list (ti= thread_info[sdg] )? '}'
            {
            pushFollow(FOLLOW_sdg_header_in_sdg_file64);
            head=sdg_header();

            state._fsp--;

             sdg = head.createSDG();
            match(input,7,FOLLOW_7_in_sdg_file80);
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:272:7: ( 'JComp' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==8) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:272:8: 'JComp'
                    {
                    match(input,8,FOLLOW_8_in_sdg_file90);
                     sdg.setJoanaCompiler(true);

                    }
                    break;

            }

            pushFollow(FOLLOW_node_list_in_sdg_file119);
            nl=node_list();

            state._fsp--;

             createNodesAndEdges(sdg, nl);
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:274:7: (ti= thread_info[sdg] )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:274:8: ti= thread_info[sdg]
                    {
                    pushFollow(FOLLOW_thread_info_in_sdg_file141);
                    ti=thread_info(sdg);

                    state._fsp--;

                     sdg.setThreadsInfo(ti);

                    }
                    break;

            }

            match(input,9,FOLLOW_9_in_sdg_file154);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sdg;
    }
    // $ANTLR end "sdg_file"


    // $ANTLR start "thread_info"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:278:9: private thread_info[SDG sdg] returns [ThreadsInformation tinfo] : (t= thread[sdg] )+ ;
    public final ThreadsInformation thread_info(SDG sdg) throws RecognitionException {
        ThreadsInformation tinfo = null;

        ThreadInstance t = null;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:279:3: ( (t= thread[sdg] )+ )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:279:5: (t= thread[sdg] )+
            {
             final LinkedList<ThreadInstance> tis = new LinkedList<ThreadInstance>();
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:280:5: (t= thread[sdg] )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==10) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:280:6: t= thread[sdg]
            	    {
            	    pushFollow(FOLLOW_thread_in_thread_info183);
            	    t=thread(sdg);

            	    state._fsp--;

            	     tis.add(t);

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

             tinfo = new ThreadsInformation(tis);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tinfo;
    }
    // $ANTLR end "thread_info"


    // $ANTLR start "thread"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:284:9: private thread[SDG sdg] returns [ThreadInstance ti] : 'Thread' id= number '{' 'Entry' en= number ';' 'Exit' ex= number ';' 'Fork' fo= number ';' 'Join' jo= number ';' 'Context' con= context[sdg] ';' 'Dynamic' dyn= bool ';' '}' ;
    public final ThreadInstance thread(SDG sdg) throws RecognitionException {
        ThreadInstance ti = null;

        int id = 0;

        int en = 0;

        int ex = 0;

        int fo = 0;

        int jo = 0;

        LinkedList<SDGNode> con = null;

        boolean dyn = false;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:285:3: ( 'Thread' id= number '{' 'Entry' en= number ';' 'Exit' ex= number ';' 'Fork' fo= number ';' 'Join' jo= number ';' 'Context' con= context[sdg] ';' 'Dynamic' dyn= bool ';' '}' )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:285:5: 'Thread' id= number '{' 'Entry' en= number ';' 'Exit' ex= number ';' 'Fork' fo= number ';' 'Join' jo= number ';' 'Context' con= context[sdg] ';' 'Dynamic' dyn= bool ';' '}'
            {
            match(input,10,FOLLOW_10_in_thread215);
            pushFollow(FOLLOW_number_in_thread219);
            id=number();

            state._fsp--;

            match(input,7,FOLLOW_7_in_thread221);
            match(input,11,FOLLOW_11_in_thread229);
            pushFollow(FOLLOW_number_in_thread235);
            en=number();

            state._fsp--;

            match(input,12,FOLLOW_12_in_thread237);
            match(input,13,FOLLOW_13_in_thread245);
            pushFollow(FOLLOW_number_in_thread252);
            ex=number();

            state._fsp--;

            match(input,12,FOLLOW_12_in_thread254);
            match(input,14,FOLLOW_14_in_thread262);
            pushFollow(FOLLOW_number_in_thread269);
            fo=number();

            state._fsp--;

            match(input,12,FOLLOW_12_in_thread271);
            match(input,15,FOLLOW_15_in_thread279);
            pushFollow(FOLLOW_number_in_thread286);
            jo=number();

            state._fsp--;

            match(input,12,FOLLOW_12_in_thread288);
            match(input,16,FOLLOW_16_in_thread296);
            pushFollow(FOLLOW_context_in_thread300);
            con=context(sdg);

            state._fsp--;

            match(input,12,FOLLOW_12_in_thread303);
            match(input,17,FOLLOW_17_in_thread311);
            pushFollow(FOLLOW_bool_in_thread315);
            dyn=bool();

            state._fsp--;

            match(input,12,FOLLOW_12_in_thread317);
            match(input,9,FOLLOW_9_in_thread323);

                  final SDGNode entry = sdg.getNode(en);
                  SDGNode exit = null; if (ex != 0) { exit = sdg.getNode(ex); }
                  SDGNode fork = null; if (fo != 0) { fork = sdg.getNode(fo); }
                  SDGNode join = null; if (jo != 0) { join = sdg.getNode(jo); }
                  ti = new ThreadInstance(id, entry, exit, fork, join, con, dyn);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ti;
    }
    // $ANTLR end "thread"


    // $ANTLR start "context"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:302:9: private context[SDG sdg] returns [LinkedList<SDGNode> cx = new LinkedList<SDGNode>();] : ( 'null' | '[' i= mayNegNumber ( ',' i= mayNegNumber )* ']' );
    public final LinkedList<SDGNode> context(SDG sdg) throws RecognitionException {
        LinkedList<SDGNode> cx =  new LinkedList<SDGNode>();;

        int i = 0;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:303:3: ( 'null' | '[' i= mayNegNumber ( ',' i= mayNegNumber )* ']' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:303:5: 'null'
                    {
                    match(input,18,FOLLOW_18_in_context351);

                    }
                    break;
                case 2 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:304:5: '[' i= mayNegNumber ( ',' i= mayNegNumber )* ']'
                    {
                    match(input,19,FOLLOW_19_in_context357);
                    pushFollow(FOLLOW_mayNegNumber_in_context361);
                    i=mayNegNumber();

                    state._fsp--;

                     cx.add(sdg.getNode(i));
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:304:52: ( ',' i= mayNegNumber )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==20) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:304:53: ',' i= mayNegNumber
                    	    {
                    	    match(input,20,FOLLOW_20_in_context366);
                    	    pushFollow(FOLLOW_mayNegNumber_in_context370);
                    	    i=mayNegNumber();

                    	    state._fsp--;

                    	     cx.add(sdg.getNode(i));

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match(input,21,FOLLOW_21_in_context377);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cx;
    }
    // $ANTLR end "context"


    // $ANTLR start "sdg_header"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:307:9: private sdg_header returns [SDGHeader header] : 'SDG' ( 'v' n= number )? (na= string )? ;
    public final SDGHeader sdg_header() throws RecognitionException {
        SDGHeader header = null;

        int n = 0;

        String na = null;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:308:3: ( 'SDG' ( 'v' n= number )? (na= string )? )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:308:5: 'SDG' ( 'v' n= number )? (na= string )?
            {
            match(input,22,FOLLOW_22_in_sdg_header396);
             int version = SDG.DEFAULT_VERSION;
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:310:7: ( 'v' n= number )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:310:8: 'v' n= number
                    {
                    match(input,23,FOLLOW_23_in_sdg_header412);
                    pushFollow(FOLLOW_number_in_sdg_header416);
                    n=number();

                    state._fsp--;

                     version = n;

                    }
                    break;

            }

             String name = null;
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:312:7: (na= string )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:312:8: na= string
                    {
                    pushFollow(FOLLOW_string_in_sdg_header437);
                    na=string();

                    state._fsp--;

                     name = na;

                    }
                    break;

            }

             header = new SDGHeader(version, name);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return header;
    }
    // $ANTLR end "sdg_header"


    // $ANTLR start "node_list"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:316:9: private node_list returns [List<SDGNodeStub> list = new LinkedList<SDGNodeStub>();] : (n= node )* ;
    public final List<SDGNodeStub> node_list() throws RecognitionException {
        List<SDGNodeStub> list =  new LinkedList<SDGNodeStub>();;

        SDGNodeStub n = null;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:317:3: ( (n= node )* )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:317:5: (n= node )*
            {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:317:5: (n= node )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=24 && LA8_0<=35)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:317:6: n= node
            	    {
            	    pushFollow(FOLLOW_node_in_node_list470);
            	    n=node();

            	    state._fsp--;

            	     list.add(n);

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "node_list"


    // $ANTLR start "node"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:320:9: private node returns [SDGNodeStub nstub] : k= node_kind id= mayNegNumber '{' node_attributes[nstub] node_edges[nstub] '}' ;
    public final SDGNodeStub node() throws RecognitionException {
        SDGNodeStub nstub = null;

        SDGNode.Kind k = null;

        int id = 0;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:321:3: (k= node_kind id= mayNegNumber '{' node_attributes[nstub] node_edges[nstub] '}' )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:321:5: k= node_kind id= mayNegNumber '{' node_attributes[nstub] node_edges[nstub] '}'
            {
            pushFollow(FOLLOW_node_kind_in_node496);
            k=node_kind();

            state._fsp--;

            pushFollow(FOLLOW_mayNegNumber_in_node500);
            id=mayNegNumber();

            state._fsp--;

             nstub = new SDGNodeStub(k, id, defaultSrcPos, defaultBcPos);
            match(input,7,FOLLOW_7_in_node509);
            pushFollow(FOLLOW_node_attributes_in_node518);
            node_attributes(nstub);

            state._fsp--;

            pushFollow(FOLLOW_node_edges_in_node528);
            node_edges(nstub);

            state._fsp--;

            match(input,9,FOLLOW_9_in_node535);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return nstub;
    }
    // $ANTLR end "node"


    // $ANTLR start "node_kind"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:328:9: private node_kind returns [SDGNode.Kind kind] : ( 'NORM' | 'PRED' | 'EXPR' | 'ENTR' | 'CALL' | 'ACTI' | 'ACTO' | 'FRMI' | 'FRMO' | 'EXIT' | 'SYNC' | 'FOLD' );
    public final SDGNode.Kind node_kind() throws RecognitionException {
        SDGNode.Kind kind = null;

        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:329:3: ( 'NORM' | 'PRED' | 'EXPR' | 'ENTR' | 'CALL' | 'ACTI' | 'ACTO' | 'FRMI' | 'FRMO' | 'EXIT' | 'SYNC' | 'FOLD' )
            int alt9=12;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            case 29:
                {
                alt9=6;
                }
                break;
            case 30:
                {
                alt9=7;
                }
                break;
            case 31:
                {
                alt9=8;
                }
                break;
            case 32:
                {
                alt9=9;
                }
                break;
            case 33:
                {
                alt9=10;
                }
                break;
            case 34:
                {
                alt9=11;
                }
                break;
            case 35:
                {
                alt9=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:329:5: 'NORM'
                    {
                    match(input,24,FOLLOW_24_in_node_kind554);
                     kind = SDGNode.Kind.NORMAL;

                    }
                    break;
                case 2 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:330:5: 'PRED'
                    {
                    match(input,25,FOLLOW_25_in_node_kind562);
                     kind = SDGNode.Kind.PREDICATE;

                    }
                    break;
                case 3 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:331:5: 'EXPR'
                    {
                    match(input,26,FOLLOW_26_in_node_kind570);
                     kind = SDGNode.Kind.EXPRESSION;

                    }
                    break;
                case 4 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:332:5: 'ENTR'
                    {
                    match(input,27,FOLLOW_27_in_node_kind578);
                     kind = SDGNode.Kind.ENTRY;

                    }
                    break;
                case 5 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:333:5: 'CALL'
                    {
                    match(input,28,FOLLOW_28_in_node_kind586);
                     kind = SDGNode.Kind.CALL;

                    }
                    break;
                case 6 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:334:5: 'ACTI'
                    {
                    match(input,29,FOLLOW_29_in_node_kind594);
                     kind = SDGNode.Kind.ACTUAL_IN;

                    }
                    break;
                case 7 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:335:5: 'ACTO'
                    {
                    match(input,30,FOLLOW_30_in_node_kind602);
                     kind = SDGNode.Kind.ACTUAL_OUT;

                    }
                    break;
                case 8 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:336:5: 'FRMI'
                    {
                    match(input,31,FOLLOW_31_in_node_kind610);
                     kind = SDGNode.Kind.FORMAL_IN;

                    }
                    break;
                case 9 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:337:5: 'FRMO'
                    {
                    match(input,32,FOLLOW_32_in_node_kind618);
                     kind = SDGNode.Kind.FORMAL_OUT;

                    }
                    break;
                case 10 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:338:5: 'EXIT'
                    {
                    match(input,33,FOLLOW_33_in_node_kind626);
                     kind = SDGNode.Kind.EXIT;

                    }
                    break;
                case 11 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:339:5: 'SYNC'
                    {
                    match(input,34,FOLLOW_34_in_node_kind634);
                     kind = SDGNode.Kind.SYNCHRONIZATION;

                    }
                    break;
                case 12 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:340:5: 'FOLD'
                    {
                    match(input,35,FOLLOW_35_in_node_kind642);
                     kind = SDGNode.Kind.FOLDED;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return kind;
    }
    // $ANTLR end "node_kind"


    // $ANTLR start "node_attributes"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:343:9: private node_attributes[SDGNodeStub node] : ( node_attr[node] ';' )* ;
    public final void node_attributes(SDGNodeStub node) throws RecognitionException {
        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:344:3: ( ( node_attr[node] ';' )* )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:344:5: ( node_attr[node] ';' )*
            {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:344:5: ( node_attr[node] ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=36 && LA10_0<=47)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:344:6: node_attr[node] ';'
            	    {
            	    pushFollow(FOLLOW_node_attr_in_node_attributes661);
            	    node_attr(node);

            	    state._fsp--;

            	    match(input,12,FOLLOW_12_in_node_attributes664);

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "node_attributes"


    // $ANTLR start "node_attr"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:347:9: private node_attr[SDGNodeStub node] : ( 'S' spos= node_source | 'B' bpos= node_bytecode | 'U' number | 'P' procId= number | 'O' op= node_oper | 'V' val= string | 'T' type= string | 'Z' tn= may_neg_num_set | 'N' | 'C' cl= string | 'A' al= pos_num_set | 'D' ds= pos_num_set | 'U' uct= string );
    public final void node_attr(SDGNodeStub node) throws RecognitionException {
        SourcePos spos = null;

        ByteCodePos bpos = null;

        int procId = 0;

        SDGNode.Operation op = null;

        String val = null;

        String type = null;

        TIntSet tn = null;

        String cl = null;

        TIntSet al = null;

        TIntSet ds = null;

        String uct = null;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:348:3: ( 'S' spos= node_source | 'B' bpos= node_bytecode | 'U' number | 'P' procId= number | 'O' op= node_oper | 'V' val= string | 'T' type= string | 'Z' tn= may_neg_num_set | 'N' | 'C' cl= string | 'A' al= pos_num_set | 'D' ds= pos_num_set | 'U' uct= string )
            int alt11=13;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:348:5: 'S' spos= node_source
                    {
                    match(input,36,FOLLOW_36_in_node_attr682);
                    pushFollow(FOLLOW_node_source_in_node_attr686);
                    spos=node_source();

                    state._fsp--;

                     node.spos = spos; defaultSrcPos = spos;

                    }
                    break;
                case 2 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:349:5: 'B' bpos= node_bytecode
                    {
                    match(input,37,FOLLOW_37_in_node_attr698);
                    pushFollow(FOLLOW_node_bytecode_in_node_attr702);
                    bpos=node_bytecode();

                    state._fsp--;

                     node.bpos = bpos; defaultBcPos = bpos;

                    }
                    break;
                case 3 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:350:5: 'U' number
                    {
                    match(input,38,FOLLOW_38_in_node_attr713);
                    pushFollow(FOLLOW_number_in_node_attr715);
                    number();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:351:5: 'P' procId= number
                    {
                    match(input,39,FOLLOW_39_in_node_attr765);
                    pushFollow(FOLLOW_number_in_node_attr769);
                    procId=number();

                    state._fsp--;

                     node.procId = procId;

                    }
                    break;
                case 5 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:352:5: 'O' op= node_oper
                    {
                    match(input,40,FOLLOW_40_in_node_attr788);
                    pushFollow(FOLLOW_node_oper_in_node_attr792);
                    op=node_oper();

                    state._fsp--;

                     node.op = op;

                    }
                    break;
                case 6 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:353:5: 'V' val= string
                    {
                    match(input,41,FOLLOW_41_in_node_attr820);
                    pushFollow(FOLLOW_string_in_node_attr824);
                    val=string();

                    state._fsp--;

                     node.val = val;

                    }
                    break;
                case 7 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:354:5: 'T' type= string
                    {
                    match(input,42,FOLLOW_42_in_node_attr852);
                    pushFollow(FOLLOW_string_in_node_attr856);
                    type=string();

                    state._fsp--;

                     node.type = type;

                    }
                    break;
                case 8 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:355:5: 'Z' tn= may_neg_num_set
                    {
                    match(input,43,FOLLOW_43_in_node_attr881);
                    pushFollow(FOLLOW_may_neg_num_set_in_node_attr885);
                    tn=may_neg_num_set();

                    state._fsp--;

                     node.threadNums = tn;

                    }
                    break;
                case 9 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:356:5: 'N'
                    {
                    match(input,44,FOLLOW_44_in_node_attr899);
                     node.nonTerm = true;

                    }
                    break;
                case 10 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:357:5: 'C' cl= string
                    {
                    match(input,45,FOLLOW_45_in_node_attr933);
                    pushFollow(FOLLOW_string_in_node_attr937);
                    cl=string();

                    state._fsp--;

                     node.classLoader = cl;

                    }
                    break;
                case 11 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:358:5: 'A' al= pos_num_set
                    {
                    match(input,46,FOLLOW_46_in_node_attr959);
                    pushFollow(FOLLOW_pos_num_set_in_node_attr963);
                    al=pos_num_set();

                    state._fsp--;

                     node.allocSites = al;

                    }
                    break;
                case 12 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:359:5: 'D' ds= pos_num_set
                    {
                    match(input,47,FOLLOW_47_in_node_attr981);
                    pushFollow(FOLLOW_pos_num_set_in_node_attr985);
                    ds=pos_num_set();

                    state._fsp--;

                     node.aliasDataSrc = ds;

                    }
                    break;
                case 13 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:360:5: 'U' uct= string
                    {
                    match(input,38,FOLLOW_38_in_node_attr1002);
                    pushFollow(FOLLOW_string_in_node_attr1006);
                    uct=string();

                    state._fsp--;

                     node.unresolvedCallTarget = uct;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "node_attr"


    // $ANTLR start "pos_num_set"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:363:9: private pos_num_set returns [TIntSet nums = new TIntHashSet();] : n= number ( ',' n2= number )* ;
    public final TIntSet pos_num_set() throws RecognitionException {
        TIntSet nums =  new TIntHashSet();;

        int n = 0;

        int n2 = 0;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:364:3: (n= number ( ',' n2= number )* )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:364:5: n= number ( ',' n2= number )*
            {
            pushFollow(FOLLOW_number_in_pos_num_set1039);
            n=number();

            state._fsp--;

             nums.add(n);
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:364:31: ( ',' n2= number )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:364:32: ',' n2= number
            	    {
            	    match(input,20,FOLLOW_20_in_pos_num_set1044);
            	    pushFollow(FOLLOW_number_in_pos_num_set1048);
            	    n2=number();

            	    state._fsp--;

            	     nums.add(n2);

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return nums;
    }
    // $ANTLR end "pos_num_set"


    // $ANTLR start "may_neg_num_set"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:367:9: private may_neg_num_set returns [TIntSet nums = new TIntHashSet();] : n= mayNegNumber ( ',' n2= mayNegNumber )* ;
    public final TIntSet may_neg_num_set() throws RecognitionException {
        TIntSet nums =  new TIntHashSet();;

        int n = 0;

        int n2 = 0;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:368:3: (n= mayNegNumber ( ',' n2= mayNegNumber )* )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:368:5: n= mayNegNumber ( ',' n2= mayNegNumber )*
            {
            pushFollow(FOLLOW_mayNegNumber_in_may_neg_num_set1074);
            n=mayNegNumber();

            state._fsp--;

             nums.add(n);
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:368:37: ( ',' n2= mayNegNumber )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:368:38: ',' n2= mayNegNumber
            	    {
            	    match(input,20,FOLLOW_20_in_may_neg_num_set1079);
            	    pushFollow(FOLLOW_mayNegNumber_in_may_neg_num_set1083);
            	    n2=mayNegNumber();

            	    state._fsp--;

            	     nums.add(n2);

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return nums;
    }
    // $ANTLR end "may_neg_num_set"


    // $ANTLR start "node_source"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:371:9: private node_source returns [SourcePos spos] : filename= string ':' startRow= number ',' startColumn= number '-' endRow= number ',' endColumn= number ;
    public final SourcePos node_source() throws RecognitionException {
        SourcePos spos = null;

        String filename = null;

        int startRow = 0;

        int startColumn = 0;

        int endRow = 0;

        int endColumn = 0;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:372:3: (filename= string ':' startRow= number ',' startColumn= number '-' endRow= number ',' endColumn= number )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:372:5: filename= string ':' startRow= number ',' startColumn= number '-' endRow= number ',' endColumn= number
            {
            pushFollow(FOLLOW_string_in_node_source1109);
            filename=string();

            state._fsp--;

            match(input,48,FOLLOW_48_in_node_source1111);
            pushFollow(FOLLOW_number_in_node_source1115);
            startRow=number();

            state._fsp--;

            match(input,20,FOLLOW_20_in_node_source1117);
            pushFollow(FOLLOW_number_in_node_source1121);
            startColumn=number();

            state._fsp--;

            match(input,49,FOLLOW_49_in_node_source1123);
            pushFollow(FOLLOW_number_in_node_source1127);
            endRow=number();

            state._fsp--;

            match(input,20,FOLLOW_20_in_node_source1129);
            pushFollow(FOLLOW_number_in_node_source1133);
            endColumn=number();

            state._fsp--;

             spos = new SourcePos(filename, startRow, startColumn, endRow, endColumn);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return spos;
    }
    // $ANTLR end "node_source"


    // $ANTLR start "node_bytecode"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:376:9: private node_bytecode returns [ByteCodePos bpos] : name= string ':' index= mayNegNumber ;
    public final ByteCodePos node_bytecode() throws RecognitionException {
        ByteCodePos bpos = null;

        String name = null;

        int index = 0;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:377:3: (name= string ':' index= mayNegNumber )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:377:5: name= string ':' index= mayNegNumber
            {
            pushFollow(FOLLOW_string_in_node_bytecode1164);
            name=string();

            state._fsp--;

            match(input,48,FOLLOW_48_in_node_bytecode1166);
            pushFollow(FOLLOW_mayNegNumber_in_node_bytecode1170);
            index=mayNegNumber();

            state._fsp--;

             bpos = new ByteCodePos(name, index);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return bpos;
    }
    // $ANTLR end "node_bytecode"


    // $ANTLR start "node_oper"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:380:9: private node_oper returns [SDGNode.Operation op] : ( 'empty' | 'intconst' | 'floatconst' | 'charconst' | 'stringconst' | 'functionconst' | 'shortcut' | 'question' | 'binary' | 'unary' | 'derefer' | 'refer' | 'array' | 'select' | 'reference' | 'declaration' | 'modify' | 'modassign' | 'assign' | 'IF' | 'loop' | 'jump' | 'compound' | 'call' | 'entry' | 'exit' | 'form-in' | 'form-ellip' | 'form-out' | 'act-in' | 'act-out' | 'monitor' );
    public final SDGNode.Operation node_oper() throws RecognitionException {
        SDGNode.Operation op = null;

        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:381:3: ( 'empty' | 'intconst' | 'floatconst' | 'charconst' | 'stringconst' | 'functionconst' | 'shortcut' | 'question' | 'binary' | 'unary' | 'derefer' | 'refer' | 'array' | 'select' | 'reference' | 'declaration' | 'modify' | 'modassign' | 'assign' | 'IF' | 'loop' | 'jump' | 'compound' | 'call' | 'entry' | 'exit' | 'form-in' | 'form-ellip' | 'form-out' | 'act-in' | 'act-out' | 'monitor' )
            int alt14=32;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt14=1;
                }
                break;
            case 51:
                {
                alt14=2;
                }
                break;
            case 52:
                {
                alt14=3;
                }
                break;
            case 53:
                {
                alt14=4;
                }
                break;
            case 54:
                {
                alt14=5;
                }
                break;
            case 55:
                {
                alt14=6;
                }
                break;
            case 56:
                {
                alt14=7;
                }
                break;
            case 57:
                {
                alt14=8;
                }
                break;
            case 58:
                {
                alt14=9;
                }
                break;
            case 59:
                {
                alt14=10;
                }
                break;
            case 60:
                {
                alt14=11;
                }
                break;
            case 61:
                {
                alt14=12;
                }
                break;
            case 62:
                {
                alt14=13;
                }
                break;
            case 63:
                {
                alt14=14;
                }
                break;
            case 64:
                {
                alt14=15;
                }
                break;
            case 65:
                {
                alt14=16;
                }
                break;
            case 66:
                {
                alt14=17;
                }
                break;
            case 67:
                {
                alt14=18;
                }
                break;
            case 68:
                {
                alt14=19;
                }
                break;
            case 69:
                {
                alt14=20;
                }
                break;
            case 70:
                {
                alt14=21;
                }
                break;
            case 71:
                {
                alt14=22;
                }
                break;
            case 72:
                {
                alt14=23;
                }
                break;
            case 73:
                {
                alt14=24;
                }
                break;
            case 74:
                {
                alt14=25;
                }
                break;
            case 75:
                {
                alt14=26;
                }
                break;
            case 76:
                {
                alt14=27;
                }
                break;
            case 77:
                {
                alt14=28;
                }
                break;
            case 78:
                {
                alt14=29;
                }
                break;
            case 79:
                {
                alt14=30;
                }
                break;
            case 80:
                {
                alt14=31;
                }
                break;
            case 81:
                {
                alt14=32;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:381:5: 'empty'
                    {
                    match(input,50,FOLLOW_50_in_node_oper1191);
                     op = SDGNode.Operation.EMPTY;

                    }
                    break;
                case 2 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:382:5: 'intconst'
                    {
                    match(input,51,FOLLOW_51_in_node_oper1208);
                     op = SDGNode.Operation.INT_CONST;

                    }
                    break;
                case 3 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:383:5: 'floatconst'
                    {
                    match(input,52,FOLLOW_52_in_node_oper1222);
                     op = SDGNode.Operation.FLOAT_CONST;

                    }
                    break;
                case 4 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:384:5: 'charconst'
                    {
                    match(input,53,FOLLOW_53_in_node_oper1234);
                     op = SDGNode.Operation.CHAR_CONST;

                    }
                    break;
                case 5 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:385:5: 'stringconst'
                    {
                    match(input,54,FOLLOW_54_in_node_oper1247);
                     op = SDGNode.Operation.STRING_CONST;

                    }
                    break;
                case 6 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:386:5: 'functionconst'
                    {
                    match(input,55,FOLLOW_55_in_node_oper1258);
                     op = SDGNode.Operation.FUNCTION_CONST;

                    }
                    break;
                case 7 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:387:5: 'shortcut'
                    {
                    match(input,56,FOLLOW_56_in_node_oper1267);
                     op = SDGNode.Operation.SHORTCUT;

                    }
                    break;
                case 8 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:388:5: 'question'
                    {
                    match(input,57,FOLLOW_57_in_node_oper1281);
                     op = SDGNode.Operation.QUESTION;

                    }
                    break;
                case 9 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:389:5: 'binary'
                    {
                    match(input,58,FOLLOW_58_in_node_oper1295);
                     op = SDGNode.Operation.BINARY;

                    }
                    break;
                case 10 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:390:5: 'unary'
                    {
                    match(input,59,FOLLOW_59_in_node_oper1311);
                     op = SDGNode.Operation.UNARY;

                    }
                    break;
                case 11 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:391:5: 'derefer'
                    {
                    match(input,60,FOLLOW_60_in_node_oper1328);
                     op = SDGNode.Operation.DEREFER;

                    }
                    break;
                case 12 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:392:5: 'refer'
                    {
                    match(input,61,FOLLOW_61_in_node_oper1343);
                     op = SDGNode.Operation.REFER;

                    }
                    break;
                case 13 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:393:5: 'array'
                    {
                    match(input,62,FOLLOW_62_in_node_oper1360);
                     op = SDGNode.Operation.ARRAY;

                    }
                    break;
                case 14 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:394:5: 'select'
                    {
                    match(input,63,FOLLOW_63_in_node_oper1377);
                     op = SDGNode.Operation.SELECT;

                    }
                    break;
                case 15 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:395:5: 'reference'
                    {
                    match(input,64,FOLLOW_64_in_node_oper1393);
                     op = SDGNode.Operation.REFERENCE;

                    }
                    break;
                case 16 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:396:5: 'declaration'
                    {
                    match(input,65,FOLLOW_65_in_node_oper1406);
                     op = SDGNode.Operation.DECLARATION;

                    }
                    break;
                case 17 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:397:5: 'modify'
                    {
                    match(input,66,FOLLOW_66_in_node_oper1417);
                     op = SDGNode.Operation.MODIFY;

                    }
                    break;
                case 18 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:398:5: 'modassign'
                    {
                    match(input,67,FOLLOW_67_in_node_oper1433);
                     op = SDGNode.Operation.MODASSIGN;

                    }
                    break;
                case 19 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:399:5: 'assign'
                    {
                    match(input,68,FOLLOW_68_in_node_oper1446);
                     op = SDGNode.Operation.ASSIGN;

                    }
                    break;
                case 20 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:400:5: 'IF'
                    {
                    match(input,69,FOLLOW_69_in_node_oper1462);
                     op = SDGNode.Operation.IF;

                    }
                    break;
                case 21 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:401:5: 'loop'
                    {
                    match(input,70,FOLLOW_70_in_node_oper1482);
                     op = SDGNode.Operation.LOOP;

                    }
                    break;
                case 22 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:402:5: 'jump'
                    {
                    match(input,71,FOLLOW_71_in_node_oper1500);
                     op = SDGNode.Operation.JUMP;

                    }
                    break;
                case 23 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:403:5: 'compound'
                    {
                    match(input,72,FOLLOW_72_in_node_oper1518);
                     op = SDGNode.Operation.COMPOUND;

                    }
                    break;
                case 24 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:404:5: 'call'
                    {
                    match(input,73,FOLLOW_73_in_node_oper1532);
                     op = SDGNode.Operation.CALL;

                    }
                    break;
                case 25 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:405:5: 'entry'
                    {
                    match(input,74,FOLLOW_74_in_node_oper1550);
                     op = SDGNode.Operation.ENTRY;

                    }
                    break;
                case 26 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:406:5: 'exit'
                    {
                    match(input,75,FOLLOW_75_in_node_oper1567);
                     op = SDGNode.Operation.EXIT;

                    }
                    break;
                case 27 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:407:5: 'form-in'
                    {
                    match(input,76,FOLLOW_76_in_node_oper1585);
                     op = SDGNode.Operation.FORMAL_IN;

                    }
                    break;
                case 28 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:408:5: 'form-ellip'
                    {
                    match(input,77,FOLLOW_77_in_node_oper1600);
                     op = SDGNode.Operation.FORMAL_ELLIP;

                    }
                    break;
                case 29 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:409:5: 'form-out'
                    {
                    match(input,78,FOLLOW_78_in_node_oper1612);
                     op = SDGNode.Operation.FORMAL_OUT;

                    }
                    break;
                case 30 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:410:5: 'act-in'
                    {
                    match(input,79,FOLLOW_79_in_node_oper1626);
                     op = SDGNode.Operation.ACTUAL_IN;

                    }
                    break;
                case 31 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:411:5: 'act-out'
                    {
                    match(input,80,FOLLOW_80_in_node_oper1642);
                     op = SDGNode.Operation.ACTUAL_OUT;

                    }
                    break;
                case 32 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:412:5: 'monitor'
                    {
                    match(input,81,FOLLOW_81_in_node_oper1657);
                     op = SDGNode.Operation.MONITOR;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "node_oper"


    // $ANTLR start "node_edges"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:415:9: private node_edges[SDGNodeStub node] : (e= edge ';' )* ;
    public final void node_edges(SDGNodeStub node) throws RecognitionException {
        SDGEdgeStub e = null;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:416:3: ( (e= edge ';' )* )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:416:5: (e= edge ';' )*
            {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:416:5: (e= edge ';' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=82 && LA15_0<=114)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:416:6: e= edge ';'
            	    {
            	    pushFollow(FOLLOW_edge_in_node_edges1685);
            	    e=edge();

            	    state._fsp--;

            	    match(input,12,FOLLOW_12_in_node_edges1687);
            	     node.edges.add(e);

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "node_edges"


    // $ANTLR start "edge"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:419:9: private edge returns [SDGEdgeStub estub] : k= edge_kind nr= number ( ':' label= string )? ;
    public final SDGEdgeStub edge() throws RecognitionException {
        SDGEdgeStub estub = null;

        SDGEdge.Kind k = null;

        int nr = 0;

        String label = null;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:420:3: (k= edge_kind nr= number ( ':' label= string )? )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:420:5: k= edge_kind nr= number ( ':' label= string )?
            {
            pushFollow(FOLLOW_edge_kind_in_edge1712);
            k=edge_kind();

            state._fsp--;

            pushFollow(FOLLOW_number_in_edge1716);
            nr=number();

            state._fsp--;

             estub = new SDGEdgeStub(k, nr);
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:420:63: ( ':' label= string )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==48) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:420:64: ':' label= string
                    {
                    match(input,48,FOLLOW_48_in_edge1721);
                    pushFollow(FOLLOW_string_in_edge1725);
                    label=string();

                    state._fsp--;

                     estub.label = label;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return estub;
    }
    // $ANTLR end "edge"


    // $ANTLR start "edge_kind"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:423:9: private edge_kind returns [SDGEdge.Kind kind] : ( 'DD' | 'DH' | 'DA' | 'CD' | 'CE' | 'UN' | 'CF' | 'NF' | 'RF' | 'CC' | 'CL' | 'PI' | 'PO' | 'SU' | 'SH' | 'SF' | 'PS' | 'FORK' | 'FORK_IN' | 'FORK_OUT' | 'JOIN' | 'ID' | 'IW' | 'SD' | 'HE' | 'FD' | 'FI' | 'RY' | 'JF' | 'SP' | 'VD' | 'RD' | 'JD' );
    public final SDGEdge.Kind edge_kind() throws RecognitionException {
        SDGEdge.Kind kind = null;

        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:425:3: ( 'DD' | 'DH' | 'DA' | 'CD' | 'CE' | 'UN' | 'CF' | 'NF' | 'RF' | 'CC' | 'CL' | 'PI' | 'PO' | 'SU' | 'SH' | 'SF' | 'PS' | 'FORK' | 'FORK_IN' | 'FORK_OUT' | 'JOIN' | 'ID' | 'IW' | 'SD' | 'HE' | 'FD' | 'FI' | 'RY' | 'JF' | 'SP' | 'VD' | 'RD' | 'JD' )
            int alt17=33;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt17=1;
                }
                break;
            case 83:
                {
                alt17=2;
                }
                break;
            case 84:
                {
                alt17=3;
                }
                break;
            case 85:
                {
                alt17=4;
                }
                break;
            case 86:
                {
                alt17=5;
                }
                break;
            case 87:
                {
                alt17=6;
                }
                break;
            case 88:
                {
                alt17=7;
                }
                break;
            case 89:
                {
                alt17=8;
                }
                break;
            case 90:
                {
                alt17=9;
                }
                break;
            case 91:
                {
                alt17=10;
                }
                break;
            case 92:
                {
                alt17=11;
                }
                break;
            case 93:
                {
                alt17=12;
                }
                break;
            case 94:
                {
                alt17=13;
                }
                break;
            case 95:
                {
                alt17=14;
                }
                break;
            case 96:
                {
                alt17=15;
                }
                break;
            case 97:
                {
                alt17=16;
                }
                break;
            case 98:
                {
                alt17=17;
                }
                break;
            case 99:
                {
                alt17=18;
                }
                break;
            case 100:
                {
                alt17=19;
                }
                break;
            case 101:
                {
                alt17=20;
                }
                break;
            case 102:
                {
                alt17=21;
                }
                break;
            case 103:
                {
                alt17=22;
                }
                break;
            case 104:
                {
                alt17=23;
                }
                break;
            case 105:
                {
                alt17=24;
                }
                break;
            case 106:
                {
                alt17=25;
                }
                break;
            case 107:
                {
                alt17=26;
                }
                break;
            case 108:
                {
                alt17=27;
                }
                break;
            case 109:
                {
                alt17=28;
                }
                break;
            case 110:
                {
                alt17=29;
                }
                break;
            case 111:
                {
                alt17=30;
                }
                break;
            case 112:
                {
                alt17=31;
                }
                break;
            case 113:
                {
                alt17=32;
                }
                break;
            case 114:
                {
                alt17=33;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:425:5: 'DD'
                    {
                    match(input,82,FOLLOW_82_in_edge_kind1750);
                     kind = SDGEdge.Kind.DATA_DEP;

                    }
                    break;
                case 2 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:426:5: 'DH'
                    {
                    match(input,83,FOLLOW_83_in_edge_kind1770);
                     kind = SDGEdge.Kind.DATA_HEAP;

                    }
                    break;
                case 3 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:427:5: 'DA'
                    {
                    match(input,84,FOLLOW_84_in_edge_kind1789);
                     kind = SDGEdge.Kind.DATA_ALIAS;

                    }
                    break;
                case 4 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:429:5: 'CD'
                    {
                    match(input,85,FOLLOW_85_in_edge_kind1808);
                     kind = SDGEdge.Kind.CONTROL_DEP_COND;

                    }
                    break;
                case 5 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:430:5: 'CE'
                    {
                    match(input,86,FOLLOW_86_in_edge_kind1820);
                     kind = SDGEdge.Kind.CONTROL_DEP_EXPR;

                    }
                    break;
                case 6 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:431:5: 'UN'
                    {
                    match(input,87,FOLLOW_87_in_edge_kind1832);
                     kind = SDGEdge.Kind.CONTROL_DEP_UNCOND;

                    }
                    break;
                case 7 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:433:5: 'CF'
                    {
                    match(input,88,FOLLOW_88_in_edge_kind1843);
                     kind = SDGEdge.Kind.CONTROL_FLOW;

                    }
                    break;
                case 8 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:434:5: 'NF'
                    {
                    match(input,89,FOLLOW_89_in_edge_kind1859);
                     kind = SDGEdge.Kind.NO_FLOW;

                    }
                    break;
                case 9 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:435:5: 'RF'
                    {
                    match(input,90,FOLLOW_90_in_edge_kind1880);
                     kind = SDGEdge.Kind.RETURN;

                    }
                    break;
                case 10 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:437:5: 'CC'
                    {
                    match(input,91,FOLLOW_91_in_edge_kind1903);
                     kind = SDGEdge.Kind.CONTROL_DEP_CALL;

                    }
                    break;
                case 11 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:438:5: 'CL'
                    {
                    match(input,92,FOLLOW_92_in_edge_kind1911);
                     kind = SDGEdge.Kind.CALL;

                    }
                    break;
                case 12 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:439:5: 'PI'
                    {
                    match(input,93,FOLLOW_93_in_edge_kind1919);
                     kind = SDGEdge.Kind.PARAMETER_IN;

                    }
                    break;
                case 13 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:440:5: 'PO'
                    {
                    match(input,94,FOLLOW_94_in_edge_kind1927);
                     kind = SDGEdge.Kind.PARAMETER_OUT;

                    }
                    break;
                case 14 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:442:5: 'SU'
                    {
                    match(input,95,FOLLOW_95_in_edge_kind1936);
                     kind = SDGEdge.Kind.SUMMARY;

                    }
                    break;
                case 15 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:443:5: 'SH'
                    {
                    match(input,96,FOLLOW_96_in_edge_kind1944);
                     kind = SDGEdge.Kind.SUMMARY_NO_ALIAS;

                    }
                    break;
                case 16 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:444:5: 'SF'
                    {
                    match(input,97,FOLLOW_97_in_edge_kind1952);
                     kind = SDGEdge.Kind.SUMMARY_DATA;

                    }
                    break;
                case 17 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:446:5: 'PS'
                    {
                    match(input,98,FOLLOW_98_in_edge_kind1961);
                     kind = SDGEdge.Kind.PARAMETER_STRUCTURE;

                    }
                    break;
                case 18 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:448:5: 'FORK'
                    {
                    match(input,99,FOLLOW_99_in_edge_kind1970);
                     kind = SDGEdge.Kind.FORK;

                    }
                    break;
                case 19 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:449:5: 'FORK_IN'
                    {
                    match(input,100,FOLLOW_100_in_edge_kind1978);
                     kind = SDGEdge.Kind.FORK_IN;

                    }
                    break;
                case 20 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:450:5: 'FORK_OUT'
                    {
                    match(input,101,FOLLOW_101_in_edge_kind1986);
                     kind = SDGEdge.Kind.FORK_OUT;

                    }
                    break;
                case 21 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:451:5: 'JOIN'
                    {
                    match(input,102,FOLLOW_102_in_edge_kind1994);
                     kind = SDGEdge.Kind.JOIN;

                    }
                    break;
                case 22 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:452:5: 'ID'
                    {
                    match(input,103,FOLLOW_103_in_edge_kind2002);
                     kind = SDGEdge.Kind.INTERFERENCE;

                    }
                    break;
                case 23 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:453:5: 'IW'
                    {
                    match(input,104,FOLLOW_104_in_edge_kind2010);
                     kind = SDGEdge.Kind.INTERFERENCE_WRITE;

                    }
                    break;
                case 24 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:454:5: 'SD'
                    {
                    match(input,105,FOLLOW_105_in_edge_kind2018);
                     kind = SDGEdge.Kind.SYNCHRONIZATION;

                    }
                    break;
                case 25 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:456:5: 'HE'
                    {
                    match(input,106,FOLLOW_106_in_edge_kind2027);
                     kind = SDGEdge.Kind.HELP;

                    }
                    break;
                case 26 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:457:5: 'FD'
                    {
                    match(input,107,FOLLOW_107_in_edge_kind2035);
                     kind = SDGEdge.Kind.FOLDED;

                    }
                    break;
                case 27 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:458:5: 'FI'
                    {
                    match(input,108,FOLLOW_108_in_edge_kind2043);
                     kind = SDGEdge.Kind.FOLD_INCLUDE;

                    }
                    break;
                case 28 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:460:5: 'RY'
                    {
                    match(input,109,FOLLOW_109_in_edge_kind2052);
                     kind = SDGEdge.Kind.READY_DEP;

                    }
                    break;
                case 29 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:461:5: 'JF'
                    {
                    match(input,110,FOLLOW_110_in_edge_kind2060);
                     kind = SDGEdge.Kind.JUMP_FLOW;

                    }
                    break;
                case 30 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:462:5: 'SP'
                    {
                    match(input,111,FOLLOW_111_in_edge_kind2068);
                     kind = SDGEdge.Kind.SUMMARY;

                    }
                    break;
                case 31 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:463:5: 'VD'
                    {
                    match(input,112,FOLLOW_112_in_edge_kind2076);
                     kind = SDGEdge.Kind.DATA_DEP_EXPR_VALUE;

                    }
                    break;
                case 32 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:464:5: 'RD'
                    {
                    match(input,113,FOLLOW_113_in_edge_kind2084);
                     kind = SDGEdge.Kind.DATA_DEP_EXPR_REFERENCE;

                    }
                    break;
                case 33 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:465:5: 'JD'
                    {
                    match(input,114,FOLLOW_114_in_edge_kind2092);
                     kind = SDGEdge.Kind.JUMP_DEP;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return kind;
    }
    // $ANTLR end "edge_kind"


    // $ANTLR start "mayNegNumber"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:468:9: private mayNegNumber returns [int nr] : ( '-' n= number | n= number );
    public final int mayNegNumber() throws RecognitionException {
        int nr = 0;

        int n = 0;


        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:469:3: ( '-' n= number | n= number )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            else if ( (LA18_0==NUMBER) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:469:5: '-' n= number
                    {
                    match(input,49,FOLLOW_49_in_mayNegNumber2113);
                    pushFollow(FOLLOW_number_in_mayNegNumber2117);
                    n=number();

                    state._fsp--;

                     nr = -n;

                    }
                    break;
                case 2 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:470:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_mayNegNumber2127);
                    n=number();

                    state._fsp--;

                     nr = n;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return nr;
    }
    // $ANTLR end "mayNegNumber"


    // $ANTLR start "number"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:473:9: private number returns [int nr] : n= NUMBER ;
    public final int number() throws RecognitionException {
        int nr = 0;

        Token n=null;

        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:474:3: (n= NUMBER )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:474:5: n= NUMBER
            {
            n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_number2150);
             nr = Integer.parseInt(n.getText());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return nr;
    }
    // $ANTLR end "number"


    // $ANTLR start "string"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:477:9: private string returns [String str] : s= STRING ;
    public final String string() throws RecognitionException {
        String str = null;

        Token s=null;

        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:478:3: (s= STRING )
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:478:5: s= STRING
            {
            s=(Token)match(input,STRING,FOLLOW_STRING_in_string2173);
             str = s.getText(); str = str.substring(1, str.length() - 1);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "string"


    // $ANTLR start "bool"
    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:481:9: private bool returns [boolean b] : ( 'true' | 'false' );
    public final boolean bool() throws RecognitionException {
        boolean b = false;

        try {
            // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:482:3: ( 'true' | 'false' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==115) ) {
                alt19=1;
            }
            else if ( (LA19_0==116) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:482:5: 'true'
                    {
                    match(input,115,FOLLOW_115_in_bool2194);
                     b = true;

                    }
                    break;
                case 2 :
                    // /afs/info.uni-karlsruhe.de/user/mmohr/git/joana/ifc/sdg/joana.ifc.sdg.graph/src/edu/kit/joana/ifc/sdg/graph/SDG_.g:483:5: 'false'
                    {
                    match(input,116,FOLLOW_116_in_bool2203);
                     b = false;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return b;
    }
    // $ANTLR end "bool"

    // Delegated rule


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\17\uffff";
    static final String DFA11_eofS =
        "\17\uffff";
    static final String DFA11_minS =
        "\1\44\2\uffff\1\4\13\uffff";
    static final String DFA11_maxS =
        "\1\57\2\uffff\1\5\13\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\3\1\15";
    static final String DFA11_specialS =
        "\17\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "",
            "",
            "\1\15\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "347:9: private node_attr[SDGNodeStub node] : ( 'S' spos= node_source | 'B' bpos= node_bytecode | 'U' number | 'P' procId= number | 'O' op= node_oper | 'V' val= string | 'T' type= string | 'Z' tn= may_neg_num_set | 'N' | 'C' cl= string | 'A' al= pos_num_set | 'D' ds= pos_num_set | 'U' uct= string );";
        }
    }


    public static final BitSet FOLLOW_sdg_header_in_sdg_file64 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_sdg_file80 = new BitSet(new long[]{0x0000000FFF000700L});
    public static final BitSet FOLLOW_8_in_sdg_file90 = new BitSet(new long[]{0x0000000FFF000600L});
    public static final BitSet FOLLOW_node_list_in_sdg_file119 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_thread_info_in_sdg_file141 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_sdg_file154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_thread_in_thread_info183 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_thread215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_thread219 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_thread221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_thread229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_thread235 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_thread237 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_thread245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_thread252 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_thread254 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_thread262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_thread269 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_thread271 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_thread279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_thread286 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_thread288 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_thread296 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_context_in_thread300 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_thread303 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_thread311 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_bool_in_thread315 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_thread317 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_thread323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_context351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_context357 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_mayNegNumber_in_context361 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_context366 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_mayNegNumber_in_context370 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_context377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_sdg_header396 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_23_in_sdg_header412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_sdg_header416 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_string_in_sdg_header437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_list470 = new BitSet(new long[]{0x0000000FFF000002L});
    public static final BitSet FOLLOW_node_kind_in_node496 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_mayNegNumber_in_node500 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_node509 = new BitSet(new long[]{0x0000FFF000000200L,0x0007FFFFFFFC0000L});
    public static final BitSet FOLLOW_node_attributes_in_node518 = new BitSet(new long[]{0x0000000000000200L,0x0007FFFFFFFC0000L});
    public static final BitSet FOLLOW_node_edges_in_node528 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_node535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_node_kind554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_node_kind562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_node_kind570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_node_kind578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_node_kind586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_node_kind594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_node_kind602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_node_kind610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_node_kind618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_node_kind626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_node_kind634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_node_kind642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_attr_in_node_attributes661 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_node_attributes664 = new BitSet(new long[]{0x0000FFF000000002L});
    public static final BitSet FOLLOW_36_in_node_attr682 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_node_source_in_node_attr686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_node_attr698 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_node_bytecode_in_node_attr702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_node_attr713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_node_attr715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_node_attr765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_node_attr769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_node_attr788 = new BitSet(new long[]{0xFFFC000000000000L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_node_oper_in_node_attr792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_node_attr820 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_string_in_node_attr824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_node_attr852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_string_in_node_attr856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_node_attr881 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_may_neg_num_set_in_node_attr885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_node_attr899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_node_attr933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_string_in_node_attr937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_node_attr959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_pos_num_set_in_node_attr963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_node_attr981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_pos_num_set_in_node_attr985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_node_attr1002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_string_in_node_attr1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_pos_num_set1039 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_pos_num_set1044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_pos_num_set1048 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_mayNegNumber_in_may_neg_num_set1074 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_may_neg_num_set1079 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_mayNegNumber_in_may_neg_num_set1083 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_string_in_node_source1109 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_node_source1111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_node_source1115 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_node_source1117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_node_source1121 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_node_source1123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_node_source1127 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_node_source1129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_node_source1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_node_bytecode1164 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_node_bytecode1166 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_mayNegNumber_in_node_bytecode1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_node_oper1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_node_oper1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_node_oper1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_node_oper1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_node_oper1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_node_oper1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_node_oper1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_node_oper1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_node_oper1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_node_oper1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_node_oper1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_node_oper1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_node_oper1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_node_oper1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_node_oper1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_node_oper1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_node_oper1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_node_oper1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_node_oper1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_node_oper1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_node_oper1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_node_oper1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_node_oper1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_node_oper1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_node_oper1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_node_oper1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_node_oper1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_node_oper1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_node_oper1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_node_oper1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_node_oper1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_node_oper1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_edge_in_node_edges1685 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_node_edges1687 = new BitSet(new long[]{0x0000000000000002L,0x0007FFFFFFFC0000L});
    public static final BitSet FOLLOW_edge_kind_in_edge1712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_edge1716 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_edge1721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_string_in_edge1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_edge_kind1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_edge_kind1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_edge_kind1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_edge_kind1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_edge_kind1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_edge_kind1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_edge_kind1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_edge_kind1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_edge_kind1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_edge_kind1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_edge_kind1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_edge_kind1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_edge_kind1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_edge_kind1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_edge_kind1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_edge_kind1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_edge_kind1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_edge_kind1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_edge_kind1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_edge_kind1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_edge_kind1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_edge_kind2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_edge_kind2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_edge_kind2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_edge_kind2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_edge_kind2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_edge_kind2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_edge_kind2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_edge_kind2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_edge_kind2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_edge_kind2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_edge_kind2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_edge_kind2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_mayNegNumber2113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_mayNegNumber2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_mayNegNumber2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_number2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_bool2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_bool2203 = new BitSet(new long[]{0x0000000000000002L});

}