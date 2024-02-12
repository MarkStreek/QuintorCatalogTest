import Link from "next/link";

export default function Home() {
  return (
      <div className="flex justify-center items-center h-screen">
        <div 
        className="m-10 text-quintor font-bold text-5xl">
          <Link href="/login" className="hover:text-black">
          Login to Quintor Catalog
          </Link>
        </div>
        <div 
        className="m-10 font-bold text-5xl">
          <Link href="/login" className="hover:text-sky-600">
          About
          </Link>
          </div>
      </div>
    );
}
