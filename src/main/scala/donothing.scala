import chisel3._
import chisel3.util._

class donothing extends Module {
  val io = IO(new Bundle {
    val in = Input(UInt(8.W))
    val out = Output(UInt(8.W))
  })
  io.out := io.in // Does nothing. :)
}

