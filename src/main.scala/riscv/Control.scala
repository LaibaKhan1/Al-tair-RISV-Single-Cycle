package RISCV
import chisel3._
import chisel3.util._
        
class Control extends Module{
    val io = IO (new Bundle{
        val opcode = Input (UInt(7.W))
        val memwrite = Output (UInt())
        val branch = Output (UInt())
        val memRead = Output (UInt())
        val regWrite = Output (UInt())
        val memtoReg = Output (UInt())
        val aLUoperation = Output (UInt())
        val operand_A_sel = Output (UInt(2.W))
        val operand_B_sel = Output (UInt(1.W))
        val extend_sel = Output (UInt(2.W))
        val next_pc_sel = Output (UInt(2.W))
    })
    when (io.opcode === 51.U){
        io.memwrite := 0.U
        io.branch := 0.U
        io.memRead := 0.U
        io.regWrite := 1.U 
        io.memtoReg := 0.U 
        io.aLUoperation := 0.U 
        io.operand_A_sel := 0.U 
        io.operand_B_sel := 0.U
        io.extend_sel := 0.U 
        io.next_pc_sel := 0.U 
    }         
    .elsewhen (io.opcode === 19.U){
        io.memwrite := 0.U
        io.branch := 0.U
        io.memRead := 0.U
        io.regWrite := 1.U 
        io.memtoReg := 0.U 
        io.aLUoperation := 0.U 
        io.operand_A_sel := 0.U
        io.operand_B_sel := 1.U
        io.extend_sel := 0.U 
        io.next_pc_sel := 0.U 
    }
    .elsewhen (io.opcode === 35.U){
        io.memwrite := 1.U
        io.branch := 0.U
        io.memRead := 0.U
        io.regWrite := 0.U 
        io.memtoReg := 0.U 
        io.aLUoperation := 0.U 
        io.operand_A_sel := 0.U
        io.operand_B_sel := 0.U
        io.extend_sel := 1.U 
        io.next_pc_sel := 0.U 
    }
    .elsewhen (io.opcode === 3.U){
        io.memwrite := 0.U
        io.branch := 0.U
        io.memRead := 1.U
        io.regWrite := 1.U 
        io.memtoReg := 1.U 
        io.aLUoperation := 0.U 
        io.operand_A_sel := 0.U
        io.operand_B_sel := 1.U
        io.extend_sel := 0.U 
        io.next_pc_sel := 0.U 
    }
    .elsewhen (io.opcode === 99.U){
        io.memwrite := 1.U
        io.branch := 1.U
        io.memRead := 0.U
        io.regWrite := 0.U 
        io.memtoReg := 0.U 
        io.aLUoperation := 0.U 
        io.operand_A_sel := 0.U
        io.operand_B_sel := 0.U
        io.extend_sel := 0.U 
        io.next_pc_sel := 1.U 
    }
    .elsewhen (io.opcode === 111.U){
        io.memwrite := 0.U
        io.branch := 0.U
        io.memRead := 0.U
        io.regWrite := 1.U 
        io.memtoReg := 0.U 
        io.aLUoperation := 0.U 
        io.operand_A_sel := 1.U
        io.operand_B_sel := 0.U
        io.extend_sel := 0.U 
        io.next_pc_sel := 1.U 
    }
    .elsewhen (io.opcode === 103.U){
        io.memwrite := 0.U
        io.branch := 0.U
        io.memRead := 0.U
        io.regWrite := 1.U 
        io.memtoReg := 0.U 
        io.aLUoperation := 0.U 
        io.operand_A_sel := 1.U
        io.operand_B_sel := 1.U
        io.extend_sel := 0.U 
        io.next_pc_sel := 0.U 
    }
    .otherwise {
        io.memwrite := 0.U
        io.branch := 0.U
        io.memRead := 0.U
        io.regWrite := 0.U 
        io.memtoReg := 0.U 
        io.aLUoperation := 0.U 
        io.operand_A_sel := 0.U
        io.operand_B_sel := 0.U
        io.extend_sel := 0.U 
        io.next_pc_sel := 0.U 
    }
}
