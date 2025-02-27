// PP.java

import java.util.*;

/*********/
/* Types */
/*********/

abstract class Type {}//Type

class Int extends Type {}//Int

class Bool extends Type {}//Bool

class Array extends Type {

    Type elements;

    Array (Type elements) {
        this.elements = elements;
    }//Array

}//Array

/**************************************/
/* Arithmetic and boolean expressions */
/**************************************/

abstract class PPExpr {

    abstract UPPExpr toUPP (ArrayList<String> locals);

}//PPExpr

class PPCte extends PPExpr {

    int val;

    PPCte (int val) {
        this.val = val;
    }//PPCte

    UPPExpr toUPP(ArrayList<String> locals) {
        return new UPPCte(val);
    }//toUPP

}//PPCte

class PPTrue extends PPExpr {

    UPPExpr toUPP(ArrayList<String> locals) {
        return new UPPTrue();
    }//toUPP

}//PPTrue

class PPFalse extends PPExpr {

    UPPExpr toUPP(ArrayList<String> locals) {
        return new UPPFalse();
    }//toUPP

}//PPFalse

class PPVar extends PPExpr {

    String name;

    PPVar (String name) {
        this.name = name;
    }//PPVar

    UPPExpr toUPP(ArrayList<String> locals) {
        //on verifie que name est dans les vars locals sinon on dit qu'elle est global.
        if (locals.contains(name)){
            return new UPPVar(name);
        }else{
            return new UPPGVar(name);
        }
    }//toUPP

}//PPVar

abstract class PPUnOp extends PPExpr {

    PPExpr e;

}//PPUnOp

class PPInv extends PPUnOp {

    PPInv (PPExpr e) {
        this.e = e;
    }//PPInv

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr inverse_e = e.toUPP(locals);
        UPPExpr zero = new UPPCte(0);
        //on dit que l'inverse est 0 - inverse_e.
        return new UPPSub(zero,inverse_e);
    }//toUPP

}//PPInv

class PPNot extends PPUnOp {

    PPNot (PPExpr e) {
        this.e = e;
    }//PPNot

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr ne = e.toUPP(locals);
        return new UPPNot(ne);
    }//toUPP

}//PPNot

abstract class PPBinOp extends PPExpr {

    PPExpr e1, e2;

}//PPBinOp

class PPAdd extends PPBinOp {

    PPAdd (PPExpr e1, PPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//PPAdd

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr ne1 = e1.toUPP(locals);
        UPPExpr ne2 = e2.toUPP(locals);
        return new UPPAdd(ne1,ne2);
    }//toUPP

}//PPAd

class PPSub extends PPBinOp {

    PPSub (PPExpr e1, PPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//PPSub

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr ne1 = e1.toUPP(locals);
        UPPExpr ne2 = e2.toUPP(locals);
        return new UPPSub(ne1,ne2);
    }//toUPP

}//PPSub

class PPMul extends PPBinOp {

    PPMul (PPExpr e1, PPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//PPMul

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr ne1 = e1.toUPP(locals);
        UPPExpr ne2 = e2.toUPP(locals);
        return new UPPMul(ne1,ne2);
    }//toUPP

}//PPMul

class PPDiv extends PPBinOp {

    PPDiv (PPExpr e1, PPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//PPDiv

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr ne1 = e1.toUPP(locals);
        UPPExpr ne2 = e2.toUPP(locals);
        return new UPPDiv(ne1,ne2);
    }//toUPP

}//PPDiv

class PPAnd extends PPBinOp {

    PPAnd (PPExpr e1, PPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//PPAnd

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr ne1 = e1.toUPP(locals);
        UPPExpr ne2 = e2.toUPP(locals);
        return new UPPAnd(ne1,ne2);
    }//toUPP

}//PPAnd

class PPOr extends PPBinOp {

    PPOr (PPExpr e1, PPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//PPOr

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr ne1 = e1.toUPP(locals);
        UPPExpr ne2 = e2.toUPP(locals);
        return new UPPOr(ne1,ne2);
    }//toUPP

}//PPOr

class PPLt extends PPBinOp {

    PPLt (PPExpr e1, PPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//PPLt

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr new_e1 = e1.toUPP(locals);
        UPPExpr new_e2 = e2.toUPP(locals);

        return new UPPLt(new_e1,new_e2);
    }//toUPP

}//PPLt

class PPLe extends PPBinOp {

    PPLe (PPExpr e1, PPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//PPLe

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr new_e1 = e1.toUPP(locals);
        UPPExpr new_e2 = e2.toUPP(locals);

        return new UPPLe(new_e1,new_e2);
    }//toUPP

}//PPLe

class PPEq extends PPBinOp {

    PPEq (PPExpr e1, PPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//PPEq

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr new_e1 = e1.toUPP(locals);
        UPPExpr new_e2 = e2.toUPP(locals);

        return new UPPEq(new_e1,new_e2);
    }//toUPP

}//PPEq

class PPNe extends PPBinOp {

    PPNe (PPExpr e1, PPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//PPNe

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr new_e1 = e1.toUPP(locals);
        UPPExpr new_e2 = e2.toUPP(locals);

        return new UPPNe(new_e1,new_e2);
    }//toUPP

}//PPNe

class PPGe extends PPBinOp {

    PPGe (PPExpr e1, PPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//PPGe

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr new_e1 = e1.toUPP(locals);
        UPPExpr new_e2 = e2.toUPP(locals);

        return new UPPGe(new_e1,new_e2);
    }//toUPP

}//PPGe

class PPGt extends PPBinOp {

    PPGt (PPExpr e1, PPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//PPGt

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr new_e1 = e1.toUPP(locals);
        UPPExpr new_e2 = e2.toUPP(locals);

        return new UPPGt(new_e1,new_e2);
    }//toUPP

}//PPGt

abstract class Callee {}//Callee

class Read extends Callee {}//Read

class Write extends Callee {}//Write

class User extends Callee {

    String name;

    User (String name) {
        this.name = name;
    }//User

}//User

class PPFunCall extends PPExpr {

    Callee callee;
    ArrayList<PPExpr> args;

    PPFunCall (Callee callee, ArrayList<PPExpr> args) {
        this.callee = callee;
        this.args = args;
    }//FunCall

    UPPExpr toUPP(ArrayList<String> locals) {
        ArrayList<UPPExpr> nargs = new ArrayList<UPPExpr>();
        for (PPExpr e : args)
            nargs.add(e.toUPP(locals));
        return new UPPFunCall(callee,nargs);
    }//toUPP

}//FunCall

class PPArrayGet extends PPExpr {

    PPExpr arr, index;

    PPArrayGet (PPExpr arr, PPExpr index) {
        this.arr = arr;
        this.index = index;
    }//PPArrayGet

    UPPExpr toUPP(ArrayList<String> locals) {
        //on calcul le decalage necessaire pour acceder à m'inporte quel element du tableau etant donné que l'on considère que chaque element est codé sur 4 octet.
        UPPExpr os = new UPPMul(index.toUPP(locals), new UPPCte(4));
        return new UPPLoad(new UPPAdd(arr.toUPP(locals), os));
    }//toUPP

}//PPArrayGet

class PPArrayAlloc extends PPExpr {

    Type type;
    PPExpr size;

    PPArrayAlloc (Type type, PPExpr size) {
        this.type = type;
        this.size = size;
    }//PPArrayAlloc

    UPPExpr toUPP(ArrayList<String> locals) {
        UPPExpr nsize = size.toUPP(locals);
        UPPExpr sizeBytes = new UPPMul(new UPPCte(4),nsize);
        ArrayList<UPPExpr> args = new ArrayList<UPPExpr>();
        args.add(sizeBytes);
        return new UPPFunCall(new Alloc(),args);
    }//toUPP

}//PPArrayAlloc

/****************/
/* Instructions */
/****************/

abstract class PPInst {

    abstract UPPInst toUPP (ArrayList<String> locals);

}//PPInst

class PPAssign extends PPInst {

    String name;
    PPExpr val;

    PPAssign (String name, PPExpr val) {
        this.name = name;
        this.val = val;
    }//PPAssign

    UPPInst toUPP (ArrayList<String> locals) {
        UPPExpr nval = val.toUPP(locals);
        return new UPPAssign(name,nval);
    }//toUPP

}//PPAssign

class PPArraySet extends PPInst {

    PPExpr arr, index, val;

    PPArraySet (PPExpr arr, PPExpr index, PPExpr val) {
        this.arr = arr;
        this.index = index;
        this.val = val;
    }//PPArraySet

    UPPInst toUPP(ArrayList<String> locals) {
        UPPExpr os = new UPPMul(new UPPCte(4), index.toUPP(locals));
        return new UPPStore(new UPPAdd(arr.toUPP(locals), os), val.toUPP(locals));
    }//toUPP

}//PPArraySet

class PPCond extends PPInst {

    PPExpr cond;
    PPInst i1, i2;

    PPCond (PPExpr cond, PPInst i1, PPInst i2) {
        this.cond = cond;
        this.i1 = i1;
        this.i2 = i2;
    }//PPCond

    UPPInst toUPP (ArrayList<String> locals) {
        UPPExpr ncond = cond.toUPP(locals);
        UPPInst ni1 = i1.toUPP(locals), ni2 = i2.toUPP(locals);
        return new UPPCond(ncond,ni1,ni2);
    }//toUPP

}//PPCond

class PPWhile extends PPInst {

    PPExpr cond;
    PPInst i;

    PPWhile (PPExpr cond, PPInst i) {
        this.cond = cond;
        this.i = i;
    }//PPWhile

    UPPInst toUPP (ArrayList<String> locals) {
        UPPExpr upp_cond = cond.toUPP(locals);
        UPPInst upp_i = i.toUPP(locals);
        return new UPPWhile(upp_cond, upp_i);
    }//toUPP

}//PPWhile

class PPProcCall extends PPInst {

    Callee callee;
    ArrayList<PPExpr> args;

    PPProcCall (Callee callee, ArrayList<PPExpr> args) {
        this.callee = callee;
        this.args = args;
    }//PPProcCall

    UPPInst toUPP (ArrayList<String> locals) {
        ArrayList<UPPExpr> upp_args = new ArrayList<UPPExpr>();
        int size = args.size();
        for (int i=0;i<size;i++) {
            upp_args.add(args.get(i).toUPP(locals));
        }
        return new UPPProcCall(callee, upp_args);
    }//toUPP

}//PPProcCall
    
class PPSkip extends PPInst {

    UPPInst toUPP (ArrayList<String> locals) {
        return new UPPSkip();
    }//toUPP

}//PPSkip

class PPSeq extends PPInst {

    PPInst i1, i2;

    PPSeq (PPInst i1, PPInst i2) {
        this.i1 = i1;
        this.i2 = i2;
    }//PPSeq

    UPPInst toUPP (ArrayList<String> locals) {
        UPPInst ni1 = i1.toUPP(locals), ni2 = i2.toUPP(locals);
        return new UPPSeq(ni1,ni2);
    }//toUPP

}//PPSeq

/***************************************/
/* Definitions of functions/procedures */
/***************************************/

class Pair<L,R> {

    final L left;
    final R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }//Pair

    static <L,R> Pair<L,R> of(L left, R right){
        return new Pair<L,R>(left, right);
    }//of

}//Pair

abstract class PPDef {

    String name;
    ArrayList<Pair<String,Type>> args, locals;
    PPInst code;

    abstract UPPDef toUPP ();

}//PPDef

class PPFun extends PPDef {

    Type ret;

    PPFun (String name, ArrayList<Pair<String,Type>> args,
         ArrayList<Pair<String,Type>> locals, PPInst code, Type ret) {
        this.name = name;
        this.args = args;
        this.locals = locals;
        this.code = code;
        this.ret = ret;
    }//PPFun

    UPPDef toUPP () {
        ArrayList<String> nargs = new ArrayList<String>();
        ArrayList<String> nlocals = new ArrayList<String>();
        ArrayList<String> nall = new ArrayList<String>();
        UPPInst ncode;
        for (Pair<String,Type> e : args) {
            nargs.add(e.left);
            nall.add(e.left);
        }//for
        nlocals.add(name);
        nall.add(name);
        for (Pair<String,Type> e : locals) {
            nlocals.add(e.left);
            nall.add(e.left);
        }//for
        ncode = code.toUPP(nall);
        return new UPPFun(name,nargs,nlocals,ncode);
    }//toUPP

}//PPFun

class PPProc extends PPDef {

    PPProc (String name, ArrayList<Pair<String,Type>> args,
            ArrayList<Pair<String,Type>> locals, PPInst code) {
        this.name = name;
        this.args = args;
        this.locals = locals;
        this.code = code;
    }//PPProc

    UPPDef toUPP () {
        ArrayList<String> upp_args = new ArrayList<String>();
        ArrayList<String> upp_locals = new ArrayList<String>();
        ArrayList<String> upp_all = new ArrayList<String>();
        UPPInst upp_code;

        int size = args.size();
        for (int i=0;i<size;i++) {
            Pair<String, Type> couple = args.get(i);
            upp_args.add(couple.left);
            upp_all.add(couple.left);
        }
        upp_locals.add(name);
        upp_all.add(name);
        for (int i=0;i<size;i++) {
            Pair<String, Type> couple = locals.get(i);
            upp_args.add(couple.left);
            upp_all.add(couple.left);
        }
        upp_code = code.toUPP(upp_all);
        return new UPPProc(name,upp_args,upp_locals,upp_code);
    }//toUPP

}//PPProc

/************/
/* Programs */
/************/

class PPProg {

    ArrayList<Pair<String,Type>> globals;
    ArrayList<PPDef> defs;
    PPInst code;

    PPProg (ArrayList<Pair<String,Type>> globals, ArrayList<PPDef> defs,
          PPInst code) {
        this.globals = globals;
        this.defs = defs;
        this.code = code;
    }//PPProg

    UPPProg toUPP () {
        ArrayList<String> nglobals = new ArrayList<String>();
        ArrayList<UPPDef> ndefs = new ArrayList<UPPDef>();
        UPPInst ncode;
        for (Pair<String,Type> e : globals)
            nglobals.add(e.left);
        for (PPDef e : defs)
            ndefs.add(e.toUPP());
        ncode = code.toUPP(new ArrayList<String>());
        return new UPPProg(nglobals,ndefs,ncode);
    }//toUPP

}//PPProg
